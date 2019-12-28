package com.springmvc.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.springmvc.model.Event;

public class EventMapper implements RowMapper<Event> {
	public Event mapRow(ResultSet rs, int rowNum) throws SQLException {
		Event event = new Event();
		event.setId(rs.getInt("id"));
		event.setEvent_name(rs.getString("event_name"));
		event.setCreated_by(rs.getString("created_by"));
		event.setCreated_date(rs.getDate("created_date"));
		event.setUpdated_by(rs.getString("updated_by"));
		event.setTeam_id(rs.getInt("team_id"));
		return event;
	}
}
