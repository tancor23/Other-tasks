package web.controller;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping(value = "/json")
public class JSONController {

	@RequestMapping(value = "/")
	public String mainPage() {

		return "json";
	}
	
	
	@RequestMapping(value = "/do")
	public @ResponseBody String mainPageJSON() {

		JSONObject json = new JSONObject();
		json.put("name", "John");
		return json.toJSONString();
	}
	
	@RequestMapping(value = "/do2")
	public @ResponseBody String mainPageJSON2(@RequestParam String pass) throws ParseException {
		
		JSONParser parser = new JSONParser();
		JSONObject jsonObject = (JSONObject) parser.parse(pass);
		String jsonPass = (String) jsonObject.get("login");
		System.out.println(jsonPass);
		JSONObject json = new JSONObject();
		json.put("key", "John2");
		return json.toJSONString();
	}
}
