package com.springmvc.login;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("name")
public class WelcomeController {

	
@RequestMapping(value = "/", method = RequestMethod.GET)
	public String showLoginPage(ModelMap model) {
		model.put("name", "in28Minutes");
		return "welcome";
	}


	/*
	 * @RequestMapping(value = "/login", method = RequestMethod.POST) public String
	 * handleLoginRequest(@RequestParam String name,@RequestParam String
	 * password,ModelMap model) {
	 * 
	 * if(!service.validateUser(name, password)) {
	 * model.put("errorMessage","Invalid Credentials"); return "login"; }
	 * model.put("name", name); model.put("password", password); return "welcome"; }
	 */

}
