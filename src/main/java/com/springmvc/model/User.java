package com.springmvc.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class User {
	
	@Id
	@GeneratedValue
	private int id;
	
	private String user_id;
	private String user_name;
	private int user_role;

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(int id, String user_id, String user_name, int user_role) {
		super();
		this.id = id;
		this.user_id = user_id;
		this.user_name = user_name;
		this.user_role = user_role;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public int getUser_role() {
		return user_role;
	}
	public void setUser_role(int user_role) {
		this.user_role = user_role;
	}


}
