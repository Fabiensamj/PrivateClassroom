package fr.utbm.core.service;

import java.util.ArrayList;

import fr.utbm.core.entity.Course;
import fr.utbm.core.entity.Location;
import fr.utbm.core.entity.CourseSession;
import fr.utbm.core.entity.Client;
import fr.utbm.core.repository.CourseDao;
import fr.utbm.core.repository.LocationDao;
import fr.utbm.core.repository.CourseSessionDao;
import fr.utbm.core.repository.ClientDao;


public class ClientService {
	
	private ClientDao clientDao;
	
	public Client searchClientById(Long id) {
		this.clientDao = new ClientDao();
		return clientDao.getClientById(id);
	}
	
	public ArrayList<Client> getAllClient(){
		this.clientDao = new ClientDao();
		return clientDao.getAllClient();
	}

}
