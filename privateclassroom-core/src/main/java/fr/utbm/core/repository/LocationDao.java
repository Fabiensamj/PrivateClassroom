package fr.utbm.core.repository;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import fr.utbm.core.entity.Location;

public class LocationDao {

	 EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("PrivateClassroom");
    EntityManager entityManager = null;  
	
   
   /**
    * @param Id
    * @return course by ("Id")
    */
   public Location getLocationById(Long id) {
   	
   	this.entityManager = this.entityManagerFactory.createEntityManager();
   	return this.entityManager.find(Location.class, id);
   }
   
   public ArrayList<Location> getAllLocation(){
   	ArrayList<Location> list = new ArrayList<Location>();
   	entityManager = entityManagerFactory.createEntityManager();
   	Query q = entityManager.createQuery("from Location");
   	list = (ArrayList<Location>) q.getResultList();
   	return list;
   	
   }
}