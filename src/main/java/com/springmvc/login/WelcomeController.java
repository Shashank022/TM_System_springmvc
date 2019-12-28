package com.springmvc.login;

import org.springframework.context.ApplicationContext;
import org.springframework.jca.context.SpringContextResourceAdapter;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
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
	String auth = SecurityContextHolder.getContext().getAuthentication().getName();
		model.put("name", auth);
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
