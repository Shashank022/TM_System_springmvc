
package com.springmvc.daoImpl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.springmvc.dao.EventDao;
import com.springmvc.model.Event;

@Repository
public class EventDaoImpl implements EventDao{

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@Autowired
	SessionFactory sessionFactory;
	
	@Autowired
	HibernateTemplate hibernateUtil;

	
	
	@SuppressWarnings("unchecked")
	@Override
	@Transactional
 	public List<Event> getallEventsList() {
 		return sessionFactory.getCurrentSession().createCriteria(Event.class).list();
 	}
 
 	@Override
 	@Transactional
 	public void saveEvent(Event event) {
		/*
		 * Session session = hibernateUtil.getSessionFactory().openSession();
		 * session.saveOrUpdate(event); sessionFactory.close();
		 */ 		
 		jdbcTemplate.update("INSERT INTO TMSystem.events (event_name, created_by, created_date, updated_by, team_id)"
 				+ " VALUES (?, ?, ?, ? , ?)", event.getEvent_name(), event.getCreated_by(),event.getCreated_date(), event.getUpdated_by(), event.getTeam_id());
 		System.out.println("I have reached here");		
 	}
 
 	@Override
 	@Transactional
 		public Event getEventDetails(int id) {
		Criteria crit = sessionFactory.getCurrentSession().createCriteria(Event.class).add(Restrictions.idEq(id));
 		 return (Event) crit.uniqueResult();
 	}
 
 	@Override
 	public void updateEvent(Event event) {
 		String updateSql = "update TMSystem.events set event= ? where id = ?";
 		jdbcTemplate.update(updateSql, new Object[]{event, event.getId()}); 
 		
 	}
 
 	@Override
 	public void deleteEvent(int id) {
 		Session session = hibernateUtil.getSessionFactory().openSession();
 		Event event = (Event) session.createCriteria(Event.class).add(Restrictions.eq("id", id)).uniqueResult();
 		session.delete(event);
 		session.close();
 	}

}
