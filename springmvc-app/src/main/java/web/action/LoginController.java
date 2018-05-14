package web.action;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import dao.UserDao;
import dao.hbn.UserDaoHbnImpl;
import domain.User;

@Controller
@RequestMapping(value = "/login")
public class LoginController {
	
	private static final Logger logger = LogManager.getLogger();
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView main() {
		System.out.println("/");
		return new ModelAndView("login_page", "user", new User ());
	}

	@RequestMapping(value = "/checkUser", method = RequestMethod.POST)
	public ModelAndView check(@ModelAttribute("user") User user) {
		System.out.println("checkUser");
		
		/*ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("new_user");
		modelAndView.addObject("user", user);*/
		
		return new ModelAndView("new_user", "user", user);
	}

	@RequestMapping(value = "/user", method = RequestMethod.GET)
	public void printUser(ModelMap model) {
		System.out.println("User");
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