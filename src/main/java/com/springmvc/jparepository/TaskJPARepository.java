/*
 * package com.springmvc.jparepository;
 * 
 * import java.util.List;
 * 
 * import javax.persistence.EntityManager; import
 * javax.persistence.PersistenceContext; import javax.transaction.Transactional;
 * 
 * import org.hibernate.Session; import org.hibernate.criterion.Projections;
 * import org.springframework.stereotype.Repository;
 * 
 * import com.springmvc.model.Task;
 * 
 * @Repository
 * 
 * @Transactional public class TaskJPARepository {
 * 
 * @PersistenceContext EntityManager entityManager;
 * 
 * 
 * 
 * 
 * public Task findById(int id) {
 * 
 * return entityManager.find(Task.class, id); //JPA
 * 
 * }
 * 
 * public List<Task> getListofTasks() {
 * 
 * Session session = entityManager.unwrap(Session.class);
 * 
 * 
 * List<Task> dbTaskList = session.createCriteria(Task.class).list();
 * 
 * System.out.println("Al the listed tasks are right here"+ dbTaskList);
 * 
 * return dbTaskList;
 * 
 * }
 * 
 * }
 */