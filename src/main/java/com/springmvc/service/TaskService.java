package com.springmvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springmvc.dao.TaskDao;
import com.springmvc.model.Task;

@Service
public class TaskService {

	@Autowired
	TaskDao taskDao;
	
	/*
	 * @Autowired TaskJPARepository taskJPARepository;
	 */
	
	public List<Task> getListofTasks() {
		System.out.println("Well we are here");
		return taskDao.getListofTasks();
	}

}
