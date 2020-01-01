package com.springmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.springmvc.service.TaskService;

@Controller
public class TaskController {
	
	
	@Autowired
	TaskService taskService;
	

	@RequestMapping(value = "/tasklist", method = RequestMethod.GET)
	public String getAlllistofEvents(ModelMap model) {
		model.addAttribute("tasks", taskService.getListofTasks());
		return "tasks";
	}

	
	
}
