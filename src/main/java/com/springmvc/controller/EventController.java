
package com.springmvc.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.springmvc.model.Event;
import com.springmvc.service.EventService;
	
	@Component
@Controller
public class EventController {

	@Autowired
	EventService eventService;
//	
//	@InitBinder
//	protected void initBinder(WebDataBinder binder) {
//		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
//		binder.registerCustomEditor(Date.class,new CustomDateEditor(dateFormat, false));
//	}

	@RequestMapping(value = "/eventlist", method = RequestMethod.GET)
	public String getAlllistofEvents(ModelMap model) {
		model.addAttribute("events", eventService.getListofEvents());
		return "events";
	}

	@RequestMapping(value = "/addevent", method = RequestMethod.GET)
	public String addNewEvent(ModelMap model) {
		 model.addAttribute("event", new Event()); 
		return "addevent";
	}

	@RequestMapping(value = "/addevent", method = RequestMethod.POST)
	public String saveEvent(ModelMap model,@Valid Event event, BindingResult result) {
		eventService.saveEvent(event);
		return "redirect:eventlist";

	}
	
	@RequestMapping(value = "/update-event", method=RequestMethod.GET)
	public String updateEvent(@RequestParam int id, ModelMap model, @Valid Event event, BindingResult result) {
		 model.addAttribute("event", eventService.getEventDetails(id)); 
		return "addevent";
	}
	
	@RequestMapping(value = "/update-event", method=RequestMethod.POST)
	public String updateExsistingEvent(@Valid Event event, BindingResult result) {
		if(result.hasErrors()) {
			return "eventlist";
		}
		eventService.updateEvent(event);
		return "redirect:eventlist";
	}
	
	
	@RequestMapping(value = "/delete-event", method=RequestMethod.GET)
	public String deleteEvent(@RequestParam int id, ModelMap model, @Valid Event event, BindingResult result) {
		eventService.deleteEvent(id);
		return "redirect:eventlist";
	}
	
	
}
