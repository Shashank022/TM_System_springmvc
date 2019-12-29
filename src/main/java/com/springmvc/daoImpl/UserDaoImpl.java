
package com.springmvc.daoImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.springmvc.dao.UserDao;
import com.springmvc.model.User;
import com.springmvc.rowmapper.UserMapper;

@Component
public class UserDaoImpl implements UserDao {

	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public List<User> getallUserList() {
		
		String SQL = "SELECT * FROM TMSystem.users";
		List<User> users = jdbcTemplate.query(SQL,new UserMapper());
				
		 for (User user : users) {
			System.out.println(user.getUser_role());
			
		}
		return users;
	}

	/*
	 * @Override public void saveUser(User user) { jdbcTemplate.
	 * update("INSERT INTO TMSystem.events (event_name, created_by, created_date, updated_by, team_id)"
	 * + " VALUES (?, ?, ?, ? , ?)", user.getEvent_name(), user.getCreated_by(),
	 * user.getCreated_date(), user.getUpdated_by(), user.getTeam_id());
	 * System.out.println("I have reached here"); }
	 */


}
