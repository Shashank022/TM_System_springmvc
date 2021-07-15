package com.springmvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.springmvc.dao.UserDao;
import com.springmvc.model.User;

@Component
public class UserService {
	
	@Autowired
	UserDao userDao;

 
	public List<User> getallUserList() {
		return userDao.getallUserList();
	}
	
	public User findBySSO(String sso) {
		return userDao.findBySSO(sso);
	}

}
