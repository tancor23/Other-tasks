package by.rebel.test.temp;

import by.rebel.test.dao.hbn.PartnerDaoHibernateImpl;
import by.rebel.test.dao.hbn.UserDaoHibernateImpl;
import by.rebel.test.domain.Partner;
import by.rebel.test.domain.User;


public class App {
	public static void main(String[] args) {
		
		User user = new User();
		user.setName("One");
		User user1 = new User();
		user1.setName("Two");
		User user2 = new User();
		user2.setName("Three");
				
		UserDaoHibernateImpl userDao = new UserDaoHibernateImpl();
		userDao.create(user);
		userDao.create(user1);
		userDao.create(user2);
		
		Partner partner = new Partner();
		Partner partner1 = new Partner();
		Partner partner2 = new Partner();
		Partner partner3 = new Partner();
		PartnerDaoHibernateImpl pDao = new PartnerDaoHibernateImpl();
		pDao.create(partner);
		pDao.create(partner1);
		pDao.create(partner2);
		pDao.create(partner3);
		
		
				
	}
}
