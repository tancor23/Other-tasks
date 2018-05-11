package web.action;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller

public class DefaultActionController {
	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public String printHello(ModelMap model) {
		model.addAttribute("message", "Hello World!");
		return "hello";
	}

	@RequestMapping(value = "/check", method = RequestMethod.GET)
	public String check(@RequestParam("login") String name, @RequestParam("password") String password, Model model) {
		System.out.println(name);
		System.out.println(password);
		if (name.equals("user") && password.equals("user")) {
			model.addAttribute("message", "Hello User");
			return "user";
		} else {
			if (name.equals("admin") && password.equals("admin")) {
				model.addAttribute("message", "Hello Admin");
				return "admin";
			} else {
				model.addAttribute("message", "Input is not correct");
				return "hello";
			}
		}
	}
}
