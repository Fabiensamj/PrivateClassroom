package fr.utbm.core.repository;

import java.util.ArrayList;
import java.sql.Time;
import java.util.Date;

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
   	Query q = entityManager.createQuery("from CourseSession order by courseCode");
   	list = (ArrayList<CourseSession>) q.getResultList();
   	return list;
   	
   }
   public ArrayList<CourseSession> getCourseSessionByCode( String code){
	   	ArrayList<CourseSession> list = new ArrayList<CourseSession>();
	   	entityManager = entityManagerFactory.createEntityManager();
	   	Query q = entityManager.createQuery("from CourseSession where courseCode= ?1 ");
	   	q.setParameter(1,code);
	   	list = (ArrayList<CourseSession>) q.getResultList();
	   	return list;
   }
   
   public ArrayList<CourseSession> getCourseSessionByDate(Date date){
	   	ArrayList<CourseSession> list = new ArrayList<CourseSession>();
	   	entityManager = entityManagerFactory.createEntityManager();
	   	Query q = entityManager.createQuery("from CourseSession where date= ?1 ");
	   	q.setParameter(1,date);
	   	list = (ArrayList<CourseSession>) q.getResultList();
	   	return list;
	   	
	}
   
   
}
