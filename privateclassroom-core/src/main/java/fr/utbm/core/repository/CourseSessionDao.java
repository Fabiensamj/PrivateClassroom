package fr.utbm.core.repository;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import fr.utbm.core.entity.CourseSession;

public class CourseSessionDao {
	
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("PrivateClassroom");
    EntityManager entityManager = null;  
	
   
   /**
    * @param Id
    * @return course_session by ("Id")
    */
   public CourseSession getCourseSessionById(Long id) {
   	
   	this.entityManager = this.entityManagerFactory.createEntityManager();
   	return this.entityManager.find(CourseSession.class, id);
   }
   
   public ArrayList<CourseSession> getAllCourseSession(){
   	ArrayList<CourseSession> list = new ArrayList<CourseSession>();
   	entityManager = entityManagerFactory.createEntityManager();
   	Query q = entityManager.createQuery("from CourseSession");
   	list = (ArrayList<CourseSession>) q.getResultList();
   	return list;
   	
   }
}
