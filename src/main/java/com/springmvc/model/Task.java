package com.springmvc.model;

import java.util.Date;

public class Task {

	private int id;
	private String task_name;
	private String task_created_by;
	private Date task_created_date;
	private String task_updated_by;
	private Date task_updated_date;
	
	public Task() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Task(int id, String task_name, String task_created_by, Date task_created_date,
			String task_updated_by, Date task_updated_date) {
		super();
		this.id = id;
		this.task_name = task_name;
		this.task_created_by = task_created_by;
		this.task_created_date = task_created_date;
		this.task_updated_by = task_updated_by;
		this.task_updated_date = task_updated_date;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTask_name() {
		return task_name;
	}
	public void setTask_name(String task_name) {
		this.task_name = task_name;
	}
	public String getTask_created_by() {
		return task_created_by;
	}
	public void setTask_created_by(String task_created_by) {
		this.task_created_by = task_created_by;
	}
	public Date getTask_created_date() {
		return task_created_date;
	}
	public void setTask_created_date(Date task_created_date) {
		this.task_created_date = task_created_date;
	}
	public String getTask_updated_by() {
		return task_updated_by;
	}
	public void setTask_updated_by(String task_updated_by) {
		this.task_updated_by = task_updated_by;
	}
	public Date getTask_updated_date() {
		return task_updated_date;
	}
	public void setTask_updated_date(Date task_updated_date) {
		this.task_updated_date = task_updated_date;
	}

	
}
