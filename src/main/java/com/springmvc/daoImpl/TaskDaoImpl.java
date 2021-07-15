
package com.springmvc.daoImpl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.springmvc.dao.TaskDao;
import com.springmvc.model.Task;

@Repository
public class TaskDaoImpl implements TaskDao {

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@Autowired
	SessionFactory sessionfactory;

	
	@Override
	public List<Task> getallUserList() {
		
		String SQL = "SELECT * FROM TMSystem.users";
		List<Task> tasks = jdbcTemplate.query(SQL, new BeanPropertyRowMapper<Task>(Task.class));
		return tasks;
	}


	@Override
	@Transactional
	public List<Task> getListofTasks() {
		Criteria crit = sessionfactory.getCurrentSession().createCriteria(Task.class);
		List<Task> tasks = crit.list();
		return tasks;
	}

	/*
	 * @Override public void saveUser(User user) { jdbcTemplate.
	 * update("INSERT INTO TMSystem.events (event_name, created_by, created_date, updated_by, team_id)"
	 * + " VALUES (?, ?, ?, ? , ?)", user.getEvent_name(), user.getCreated_by(),
	 * user.getCreated_date(), user.getUpdated_by(), user.getTeam_id());
	 * System.out.println("I have reached here"); }
	 */


}
