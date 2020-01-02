//package com.springmvc.rowmapper;
//
//import java.sql.ResultSet;
//import java.sql.SQLException;
//
//import org.springframework.jdbc.core.RowMapper;
//
//import com.springmvc.model.Task;
//import com.springmvc.model.User;
//
//public class TaskMapper implements RowMapper<Task> {
//	public Task mapRow(ResultSet rs, int rowNum) throws SQLException {
//		Task task = new Task();
//		task.setId(rs.getInt("id"));
//		task.setTask_name(rs.getString("task_name"));
//		task.setTask_created_by(rs.getString(("task_created_by")));
//		task.setTask_created_date(rs.getDate("task_created_date"));
//		task.setTask_updated_by(rs.getString("task_updated_by"));
//		task.setTask_updated_date(rs.getDate("task_updated_date"));
//		return task;
//	}
//}
