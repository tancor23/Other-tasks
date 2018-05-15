package web.controller;

import javax.validation.Valid;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import domain.User;

@Controller
@RequestMapping(value = "/login")
public class LoginController {

	private static final Logger logger = LogManager.getLogger();

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView main() {
		logger.info("/");
		return new ModelAndView("login_page", "user", new User());
	}

	@RequestMapping(value = "/checkUser", method = RequestMethod.POST)
	public String check(@Valid @ModelAttribute("user") User user, BindingResult bindingResult, Model model) {
		if (bindingResult.hasErrors()) {
			logger.info("Method check has errors");
			return "login_page";
		}
		model.addAttribute("user", user);
		logger.info(user.getLogin() + "     " + user.getPassword() + "          " + user.getId());
		logger.info(bindingResult.hasErrors());
		logger.info("checkUser");
		return "new_user";

	}
	
	@RequestMapping(value = "/get-json-user", method = RequestMethod.GET, produces = "application/json")
	@ResponseBody
	public User getJsonUser(@RequestParam("login") String login) {
		User user = new User();
		user.setLogin(login);
		return user;
	}
	
	@RequestMapping(value = "/put-json-user", method = RequestMethod.POST, produces = "application/json")
	public ResponseEntity<String> setJsonUser(@RequestBody User user){
		logger.info(user.getLogin());
		return new ResponseEntity<String>(HttpStatus.ACCEPTED);
	}
}