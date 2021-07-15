package com.springmvc.dao;

import java.util.List;

import com.springmvc.model.User;

public interface UserDao {
	

	public List<User> getallUserList();
	//public void saveUser(User user);

	public User findBySSO(String sso);

}
