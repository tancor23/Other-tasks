package dao.hbn;

import java.io.Serializable;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public final class SessionFactoryManager implements Serializable {
	
	private static Logger logger = LogManager.getLogger(SessionFactoryManager.class);
	private static final long serialVersionUID = 1147075288085691300L;
	private static final SessionFactory SESSION_FACTORY;
	private SessionFactoryManager() {}

	static {
		try {
			Configuration configuration = new Configuration();
			configuration = configuration.configure("config/hibernate.cfg.xml");
			StandardServiceRegistryBuilder serviceRegistry = new StandardServiceRegistryBuilder();
			serviceRegistry = serviceRegistry.applySettings(configuration.getProperties());
			SESSION_FACTORY = configuration.buildSessionFactory(serviceRegistry.build());
		} catch (Exception e) {
			logger.error("Error in SessionFactoryManager ", e);
			throw new ExceptionInInitializerError(e);
		}
	}
	
	public static SessionFactory getSessionFactory() {
		return SESSION_FACTORY;
	}
}