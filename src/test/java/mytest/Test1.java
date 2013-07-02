package mytest;

import java.util.Date;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class Test1 {

	public SessionFactory getSessionFactory() {
		Configuration cfg = new Configuration();
		cfg.configure();

		ServiceRegistry sr = new StandardServiceRegistryBuilder()
				.applySettings(cfg.getProperties()).build();
		SessionFactory sessionFactory = cfg.buildSessionFactory(sr);
		return sessionFactory;
	}

	public static void main(String[] args) {
		getList();
	}

	private static void getList() {
		SessionFactory sessionFactory = new Test1().getSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		List<SysUserPO> result = session.createQuery("from SysUserPO").list();
		for (SysUserPO sysUser : (List<SysUserPO>) result) {
			System.out.println("SysUser (" + sysUser.getUsername() + ") : "
					+ sysUser.getPassword());
		}
		session.getTransaction().commit();
		session.close();
	}

	private static void save() {
		SessionFactory sessionFactory = new Test1().getSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		SysUserPO po = new SysUserPO();
		po.setUsername("test" + new Date());
		po.setPassword("123");
		session.save(po);
		session.getTransaction().commit();
		session.close();
	}
}
