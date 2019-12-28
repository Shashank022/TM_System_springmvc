
package com.springmvc.daoImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.springmvc.dao.EventDao;
import com.springmvc.model.Event;
import com.springmvc.rowmapper.EventMapper;

@Component
public class EventDaoImpl implements EventDao {

	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public List<Event> getallEventsList() {
		
		String SQL = "SELECT * FROM TMSystem.events";
		List <Event> events = jdbcTemplate.query(SQL, new EventMapper());

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

}
