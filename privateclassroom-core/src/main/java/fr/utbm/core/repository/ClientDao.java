package fr.utbm.core.repository;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import fr.utbm.core.entity.Client;

public class ClientDao {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("PrivateClassroom");
    EntityManager entityManager = null;  
	
   
   /**
    * @param Id
    * @return client by ("Id")
    */
   public Client getClientById(Long id) {
   	
   	this.entityManager = this.entityManagerFactory.createEntityManager();
   	return this.entityManager.find(Client.class, id);
   }
   
   public ArrayList<Client> getAllClient(){
   	ArrayList<Client> list = new ArrayList<Client>();
   	entityManager = entityManagerFactory.createEntityManager();
   	Query q = entityManager.createQuery("from Client");
   	list = (ArrayList<Client>) q.getResultList();
   	return list;
   	
   }

}
