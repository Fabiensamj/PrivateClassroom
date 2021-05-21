package fr.utbm.core.repository;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import fr.utbm.core.entity.Client;
import fr.utbm.core.entity.Course;

public class CourseDao {

	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("PrivateClassroom");
    EntityManager entityManager = null;
    
    /**
     * @param code
     * @return course by ("code")
     */
    public Course getCourseByCode(String code) { 
    	entityManager = entityManagerFactory.createEntityManager();
    	return entityManager.find(Course.class, code);
    }
    
    public ArrayList<Course> getAllCourse(){
       	ArrayList<Course> list = new ArrayList<Course>();
       	entityManager = entityManagerFactory.createEntityManager();
       	Query q = entityManager.createQuery("from Course");
       	list = (ArrayList<Course>) q.getResultList();
       	return list;
       	
       }
    public ArrayList<Course> getCourseByName(String name){
       	ArrayList<Course> list = new ArrayList<Course>();
       	entityManager = entityManagerFactory.createEntityManager();
       	Query q = entityManager.createQuery("from Course where title like ?1 ");
       	q.setParameter(1,"%"+name+"%");
       	list = (ArrayList<Course>) q.getResultList();
       	return list;
       	
       }
}
