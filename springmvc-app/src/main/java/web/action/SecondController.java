package web.action;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import dao.UserDao;
import dao.hbn.UserDaoHbnImpl;
import domain.User;

@Controller
@RequestMapping(value = "/second")
public class SecondController {
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public void print(ModelMap model) {
		System.out.println("/");
	}

	@RequestMapping(value = "/admin", method = RequestMethod.GET)
	public void printAdmin(ModelMap model) {
		System.out.println("Admin");
	}

	@RequestMapping(value = "/user", method = RequestMethod.GET)
	public void printUser(ModelMap model) {
		System.out.println("User Second");
	}

	@RequestMapping(value = "/check", method = RequestMethod.GET)
	public String check(@RequestParam("login") String name, @RequestParam("password") String password, Model model) {

		if (name.equals("user") && password.equals("user")) {
			model.addAttribute("message", "Hello User");
			return "user";
		} else {
			if (name.equals("admin") && password.equals("admin")) {
				model.addAttribute("message", "Hello Admin");
				return "admin";
			} else {
				User user = new User();
				user.setLogin(name);
				user.setPassword(password);
				UserDao userDao = new UserDaoHbnImpl();
				userDao.create(user);
				model.addAttribute("message", "New user was created");
				return "newuser";
			}
		}
	}
}