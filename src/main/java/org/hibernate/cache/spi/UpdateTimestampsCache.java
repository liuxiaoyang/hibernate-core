/*
 * Hibernate, Relational Persistence for Idiomatic Java
 *
 * Copyright (c) 2011, Red Hat Inc. or third-party contributors as
 * indicated by the @author tags or express copyright attribution
 * statements applied by the authors.  All third-party contributions are
 * distributed under license by Red Hat Inc.
 *
 * This copyrighted material is made available to anyone wishing to use, modify,
 * copy, or redistribute it subject to the terms and conditions of the GNU
 * Lesser General Public License, as published by the Free Software Foundation.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY
 * or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU Lesser General Public License
 * for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this distribution; if not, write to:
 * Free Software Foundation, Inc.
 * 51 Franklin Street, Fifth Floor
 * Boston, MA  02110-1301  USA
 */
package org.hibernate.cache.spi;

import java.io.Serializable;
import java.util.Properties;
import java.util.Set;

import org.jboss.logging.Logger;

import org.hibernate.cache.CacheException;
import org.hibernate.cfg.Settings;
import org.hibernate.engine.spi.SessionFactoryImplementor;
import org.hibernate.internal.CoreMessageLogger;

/**
 * Tracks the timestamps of the most recent updates to particular tables. It is
 * important that the cache timeout of the underlying cache implementation be set
 * to a higher value than the timeouts of any of the query caches. In fact, we
 * recommend that the the underlying cache not be configured for expiry at all.
 * Note, in particular, that an LRU cache expiry policy is never appropriate.
 *
 * @author Gavin King
 * @author Mikheil Kapanadze
 */
public class UpdateTimestampsCache {
	private static final CoreMessageLogger LOG = Logger.getMessageLogger( CoreMessageLogger.class, UpdateTimestampsCache.class.getName() );

	/**
	 * The region name of the update-timestamps cache.
	 */
	public static final String REGION_NAME = UpdateTimestampsCache.class.getName();


	private final SessionFactoryImplementor factory;
	private final TimestampsRegion region;

	/**
	 * Constructs an UpdateTimestampsCache.
	 *
	 * @param settings The SessionFactory settings
	 * @param props Any properties
	 * @param factory The SessionFactory
	 */
	public UpdateTimestampsCache(Settings settings, Properties props, final SessionFactoryImplementor factory) {
		this.factory = factory;
		final String prefix = settings.getCacheRegionPrefix();
		final String regionName = prefix == null ? REGION_NAME : prefix + '.' + REGION_NAME;

		LOG.startingUpdateTimestampsCache( regionName );
		this.region = settings.getRegionFactory().buildTimestampsRegion( regionName, props );
	}

	/**
	 * Constructs an UpdateTimestampsCache.
	 *
	 * @param settings The SessionFactory settings
	 * @param props Any properties
	 */
	@SuppressWarnings({"UnusedDeclaration"})
	public UpdateTimestampsCache(Settings settings, Properties props) {
		this( settings, props, null );
	}

	/**
	 * Perform pre-invalidation.
	 *
	 * @param spaces The spaces to pre-invalidate
	 *
	 * @throws CacheException Indicated problem delegating to underlying region.
	 */
	@SuppressWarnings({"UnnecessaryBoxing"})
	public void preinvalidate(Serializable[] spaces) throws CacheException {
		final boolean debug = LOG.isDebugEnabled();
		final boolean stats = factory != null && factory.getStatistics().isStatisticsEnabled();

		final Long ts = region.nextTimestamp() + region.getTimeout();

		for ( Serializable space : spaces ) {
			if ( debug ) {
				LOG.debugf( "Pre-invalidating space [%s], timestamp: %s", space, ts );
			}
			//put() has nowait semantics, is this really appropriate?
			//note that it needs to be async replication, never local or sync
			region.put( space, ts );
			if ( stats ) {
				factory.getStatisticsImplementor().updateTimestampsCachePut();
			}
		}
	}

	/**
	 * Perform invalidation.
	 *
	 * @param spaces The spaces to pre-invalidate
	 *
	 * @throws CacheException Indicated problem delegating to underlying region.
	 */
	@SuppressWarnings({"UnnecessaryBoxing"})
	public void invalidate(Serializable[] spaces) throws CacheException {
		final boolean debug = LOG.isDebugEnabled();
		final boolean stats = factory != null && factory.getStatistics().isStatisticsEnabled();

		final Long ts = region.nextTimestamp();

		for (Serializable space : spaces) {
			if ( debug ) {
				LOG.debugf( "Invalidating space [%s], timestamp: %s", space, ts );
			}
			//put() has nowait semantics, is this really appropriate?
			//note that it needs to be async replication, never local or sync
			region.put( space, ts );
			if ( stats ) {
				factory.getStatisticsImplementor().updateTimestampsCachePut();
			}
		}
	}

	/**
	 * Perform an up-to-date check for the given set of query spaces.
	 *
	 * @param spaces The spaces to check
	 * @param timestamp The timestamp against which to check.
	 *
	 * @return Whether all those spaces are up-to-date
	 *
	 * @throws CacheException Indicated problem delegating to underlying region.
	 */
	@SuppressWarnings({"unchecked", "UnnecessaryUnboxing"})
	public boolean isUpToDate(Set spaces, Long timestamp) throws CacheException {
		final boolean debug = LOG.isDebugEnabled();
		final boolean stats = factory != null && factory.getStatistics().isStatisticsEnabled();

		for ( Serializable space : (Set<Serializable>) spaces ) {
			final Long lastUpdate = (Long) region.get( space );
			if ( lastUpdate == null ) {
				if ( stats ) {
					factory.getStatisticsImplementor().updateTimestampsCacheMiss();
				}
				//the last update timestamp was lost from the cache
				//(or there were no updates since startup!)
				//updateTimestamps.put( space, new Long( updateTimestamps.nextTimestamp() ) );
				//result = false; // safer
			}
			else {
				if ( debug ) {
					LOG.debugf(
							"[%s] last update timestamp: %s",
							space,
							lastUpdate + ", result set timestamp: " + timestamp
					);
				}
				if ( stats ) {
					factory.getStatisticsImplementor().updateTimestampsCacheHit();
				}
				if ( lastUpdate >= timestamp ) {
					return false;
				}
			}
		}
		return true;
	}

	/**
	 * Clear the update-timestamps data.
	 *
	 * @throws CacheException Indicates problem delegating call to underlying region.
	 */
	public void clear() throws CacheException {
		region.evictAll();
	}

	/**
	 * Destroys the cache.
	 *
	 * @throws CacheException Indicates problem delegating call to underlying region.
	 */
	public void destroy() {
		try {
			region.destroy();
		}
		catch (Exception e) {
			LOG.unableToDestroyUpdateTimestampsCache( region.getName(), e.getMessage() );
		}
	}

	/**
	 * Get the underlying cache region where data is stored..
	 *
	 * @return The underlying region.
	 */
	public TimestampsRegion getRegion() {
		return region;
	}

	@Override
	public String toString() {
		return "UpdateTimestampsCache";
	}

}
