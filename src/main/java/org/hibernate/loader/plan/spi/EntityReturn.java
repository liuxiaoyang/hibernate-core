/*
 * Hibernate, Relational Persistence for Idiomatic Java
 *
 * Copyright (c) 2012, Red Hat Inc. or third-party contributors as
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
package org.hibernate.loader.plan.spi;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.hibernate.AssertionFailure;
import org.hibernate.LockMode;
import org.hibernate.engine.FetchStrategy;
import org.hibernate.engine.spi.EntityKey;
import org.hibernate.engine.spi.SessionFactoryImplementor;
import org.hibernate.loader.PropertyPath;
import org.hibernate.loader.spi.ResultSetProcessingContext;
import org.hibernate.persister.entity.EntityPersister;

import static org.hibernate.loader.spi.ResultSetProcessingContext.IdentifierResolutionContext;

/**
 * Represents an entity return value in the query results.  Not the same
 * as a result (column) in the JDBC ResultSet!
 *
 * @see Return
 *
 * @author Steve Ebersole
 */
public class EntityReturn extends AbstractFetchOwner implements Return, EntityReference, CopyableReturn {

	private final EntityPersister persister;

	private final PropertyPath propertyPath = new PropertyPath(); // it's a root

	private final LockMode lockMode;

	private final FetchOwnerDelegate fetchOwnerDelegate;

	private IdentifierDescription identifierDescription;

	/**
	 * Construct an {@link EntityReturn}.
	 *
	 * @param sessionFactory - the session factory.
	 * @param lockMode - the lock mode.
	 * @param entityName - the entity name.
	 */
	public EntityReturn(
			SessionFactoryImplementor sessionFactory,
			LockMode lockMode,
			String entityName) {
		super( sessionFactory );
		this.persister = sessionFactory.getEntityPersister( entityName );
		this.lockMode = lockMode;
		this.fetchOwnerDelegate = new EntityFetchOwnerDelegate( persister );
	}

	protected EntityReturn(EntityReturn original, CopyContext copyContext) {
		super( original, copyContext );
		this.persister = original.persister;
		this.lockMode = original.lockMode;
		this.fetchOwnerDelegate = original.fetchOwnerDelegate;
	}

	@Override
	public LockMode getLockMode() {
		return lockMode;
	}

	@Override
	public EntityReference getEntityReference() {
		return this;
	}

	@Override
	public EntityPersister getEntityPersister() {
		return persister;
	}

	@Override
	public IdentifierDescription getIdentifierDescription() {
		return identifierDescription;
	}

	@Override
	public void validateFetchPlan(FetchStrategy fetchStrategy) {
	}

	@Override
	public EntityPersister retrieveFetchSourcePersister() {
		return getEntityPersister();
	}

	@Override
	public PropertyPath getPropertyPath() {
		return propertyPath;
	}

	@Override
	public void hydrate(ResultSet resultSet, ResultSetProcessingContext context) throws SQLException {
		EntityKey entityKey = getEntityKeyFromContext( context );
		if ( entityKey != null ) {
			context.getIdentifierResolutionContext( this ).registerEntityKey( entityKey );
			return;
		}

		identifierDescription.hydrate( resultSet, context );

		for ( Fetch fetch : getFetches() ) {
			fetch.hydrate( resultSet, context );
		}
	}

	private EntityKey getEntityKeyFromContext(ResultSetProcessingContext context) {
		if ( context.getDictatedRootEntityKey() != null ) {
			return context.getDictatedRootEntityKey();
		}
		else if ( context.getQueryParameters().getOptionalId() != null ) {
			return context.getSession().generateEntityKey( 
					context.getQueryParameters().getOptionalId(),
					getEntityPersister() 
			);
		}
		return null;
	}
	
	@Override
	public void resolve(ResultSet resultSet, ResultSetProcessingContext context) throws SQLException {
		final IdentifierResolutionContext identifierResolutionContext = context.getIdentifierResolutionContext( this );
		EntityKey entityKey = identifierResolutionContext.getEntityKey();
		if ( entityKey != null ) {
			return;
		}

		entityKey = identifierDescription.resolve( resultSet, context );
		identifierResolutionContext.registerEntityKey( entityKey );

		for ( Fetch fetch : getFetches() ) {
			fetch.resolve( resultSet, context );
		}
	}

	@Override
	public Object read(ResultSet resultSet, ResultSetProcessingContext context) throws SQLException {
		Object objectForThisEntityReturn = null;
		for ( IdentifierResolutionContext identifierResolutionContext : context.getIdentifierResolutionContexts() ) {
			final EntityReference entityReference = identifierResolutionContext.getEntityReference();
			final EntityKey entityKey = identifierResolutionContext.getEntityKey();
			if ( entityKey == null ) {
				throw new AssertionFailure( "Could not locate resolved EntityKey");
			}
			final Object object =  context.resolveEntityKey( entityKey, entityReference );
			if ( this == entityReference ) {
				objectForThisEntityReturn = object;
			}
		}
		return objectForThisEntityReturn;
	}

	@Override
	public void injectIdentifierDescription(IdentifierDescription identifierDescription) {
		this.identifierDescription = identifierDescription;
	}

	@Override
	public String toString() {
		return "EntityReturn(" + persister.getEntityName() + ")";
	}

	@Override
	public EntityReturn makeCopy(CopyContext copyContext) {
		return new EntityReturn( this, copyContext );
	}

	@Override
	protected FetchOwnerDelegate getFetchOwnerDelegate() {
		return fetchOwnerDelegate;
	}
}
