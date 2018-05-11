package dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import dao.hbn.SessionFactoryManager;

public interface BaseDao <T> {

	default void create(T entity) {
		SessionFactory sessionFactory = SessionFactoryManager.getSessionFactory();
		Session session = sessionFactory.openSession();
		session.getTransaction().begin();
		session.save(entity);
		session.getTransaction().commit();
		session.close();
	}

	T read(int id);

	List<T> readAll();

	default void update(T entity) {
		SessionFactory sessionFactory = SessionFactoryManager.getSessionFactory();
		Session session = sessionFactory.openSession();
		session.getTransaction().begin();
		session.update(entity);
		session.getTransaction().commit();
		session.close();
	}

	default void delete(int id) {
		SessionFactory sessionFactory = SessionFactoryManager.getSessionFactory();
		Session session = sessionFactory.openSession();
		session.getTransaction().begin();
		T entity = read(id);
		session.delete(entity);
		session.getTransaction().commit();
		session.close();
	}
}
