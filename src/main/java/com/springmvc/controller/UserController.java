
package com.springmvc.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.springmvc.model.Event;
import com.springmvc.service.EventService;
import com.springmvc.service.UserService;

@Component
@Controller
public class UserController {

	@Autowired
	UserService userService;

	@RequestMapping(value = "/userlist", method = RequestMethod.GET)
	public String getAlllistofEvents(ModelMap model) {
		model.addAttribute("users", userService.getallUserList());
		return "users";

	}

	@RequestMapping(value = "/adduser", method = RequestMethod.GET)
	public String addNewEvent(ModelMap model) {
		 model.addAttribute("event", new Event()); 
		return "addevent";
	}

	/*
	 * @RequestMapping(value = "/adduser", method = RequestMethod.POST) public
	 * String saveEvent(ModelMap model,@Valid Event event, BindingResult result) {
	 * userService.saveEvent(event); return "redirect:eventlist";
	 * 
	 * }
	 */
}
