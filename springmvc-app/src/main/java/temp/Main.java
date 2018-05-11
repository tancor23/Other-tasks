package temp;

import dao.UserDao;
import dao.hbn.UserDaoHbnImpl;
import domain.User;

public class Main {

	public static void main(String[] args) {
		
		User user1 = new User();
		user1.setLogin("user");
		user1.setPassword("user");
		User user2 = new User();
		user2.setLogin("admin");
		user2.setPassword("admin");
		User user3 = new User();
		user3.setLogin("default");
		user3.setPassword("default");
		
		UserDao userDao = new UserDaoHbnImpl();
		userDao.create(user1);
		userDao.create(user2);
		userDao.create(user3);
		
	}

}
