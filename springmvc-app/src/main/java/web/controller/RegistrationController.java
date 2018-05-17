package web.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import dao.UserDao;
import dao.hbn.UserDaoHbnImpl;
import domain.User;

@Controller
@RequestMapping(value = "/registration")
public class RegistrationController {

	private static final Logger logger = LogManager.getLogger(LoginController.class.getClass());

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView main() {
		logger.info("/");
		return new ModelAndView("registration", "user", new User());
	}

	@RequestMapping(value = "/check-password", method = RequestMethod.GET)
	public @ResponseBody String checkPassword(@RequestParam String password) {
		return "rrr";
	}

	@RequestMapping(value = "/check-login", method = RequestMethod.GET)
	public @ResponseBody String checkLogin(@RequestParam String login) {
		UserDao userDao = new UserDaoHbnImpl();
		if (userDao.loginIsFree(login)) {
			return login + " is!";
		} else {
			return login + " is free!";
		}
	}

	@RequestMapping(value = "/failed", method = RequestMethod.GET)
	public ModelAndView failed() {
		return new ModelAndView("login-failed", "message", "Login failed!");
	}
		
}
