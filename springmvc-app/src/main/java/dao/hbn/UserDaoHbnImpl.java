package dao.hbn;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;

import dao.UserDao;
import domain.User;


public class UserDaoHbnImpl implements UserDao {

	@Override
	public User read(int userId) {
		Session session = SessionFactoryManager.getSessionFactory().openSession();
		session.getTransaction().begin();
		User user = (User) session.get(User.class, userId);
		session.getTransaction().commit();
		session.close();
		return user;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<User> readAll() {
		Session session = SessionFactoryManager.getSessionFactory().openSession();
		Criteria criteria = session.createCriteria(User.class);
		List<User> users = criteria.list();
		session.close();
		return users;
	}
}