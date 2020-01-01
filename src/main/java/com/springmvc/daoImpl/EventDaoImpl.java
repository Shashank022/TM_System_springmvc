
package com.springmvc.daoImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.springmvc.dao.EventDao;
import com.springmvc.model.Event;
import com.springmvc.rowmapper.EventMapper;

@Repository
public class EventDaoImpl implements EventDao{

	@Autowired
	JdbcTemplate jdbcTemplate;
	
  
 	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
 	public List<Event> getallEventsList() {
 		
 		String SQL = "SELECT * FROM TMSystem.events";
 		List<Event> events = jdbcTemplate.query(SQL, new EventMapper());
 
 		 for (Event event : events) {
 			System.out.println(event.getCreated_by());
 		}
 		return events;
 	}
 
 	@Override
 	public void saveEvent(Event event) {
 		jdbcTemplate.update("INSERT INTO TMSystem.events (event_name, created_by, created_date, updated_by, team_id)"
 				+ " VALUES (?, ?, ?, ? , ?)", event.getEvent_name(), event.getCreated_by(), 
 				event.getCreated_date(), event.getUpdated_by(), event.getTeam_id());
 		System.out.println("I have reached here");		
 	}
 
 	@Override
 		public Event getEventDetails(int id) {
 			 String sql = "SELECT * FROM TMSystem.events WHERE ID = ?";
 		 Event event = jdbcTemplate.queryForObject(sql, new Object[] { id }, new EventMapper());
 		 return event;
 	}
 
 	@Override
 	public void updateEvent(Event event) {
 		String updateSql = "update TMSystem.events set event= ? where id = ?";
 		jdbcTemplate.update(updateSql, new Object[]{event, event.getId()});
 		
 	}
 
 	@Override
 	public void deleteEvent(int id) {
 		System.out.println("Deleting th information  with the ID :" + id);
 		jdbcTemplate.update("delete from person where id=?", new Object[] { id });
 	}
  
  	
 	public int deleteById(int id) {
 		return jdbcTemplate.update("delete from person where id=?", new Object[] { id });
 	}
 
/*
 * public int insert(Person person) { return
 * jdbcTemplate.update("insert into person (id, name, location, birth_date) " +
 * "values(?,  ?, ?, ?)", new Object[] { person.getId(), person.getName(),
 * person.getLocation(), new Timestamp(person.getBirthDate().getTime()) }); }
 * 
 * public int update(Person person) { return
 * jdbcTemplate.update("update person " +
 * " set name = ?, location = ?, birth_date = ? " + " where id = ?", new
 * Object[] { person.getName(), person.getLocation(), new
 * Timestamp(person.getBirthDate().getTime()), person.getId() }); }
 */

}
