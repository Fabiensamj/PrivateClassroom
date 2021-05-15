package fr.utbm.core.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import fr.utbm.core.entity.Course;

public class CourseDao {

	 
    
    /**
     * @param code
     * @return course by ("code")
     */
    public Course getCourseByCode(String code) {
    	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("privateClassroom");
        EntityManager entityManager = null; 
    	entityManager = entityManagerFactory.createEntityManager();
    	return entityManager.find(Course.class, code);
    }
}