package fr.utbm.core.controller;

import java.util.ArrayList;

import fr.utbm.core.entity.Client;
import fr.utbm.core.entity.CourseSession;
import fr.utbm.core.entity.Course;
import fr.utbm.core.entity.Location;
import fr.utbm.core.service.ClientService;
import fr.utbm.core.service.CourseService;

public class ShowClientController {
	
	public ClientService cs = new ClientService();
	
	public void showClient(Long idClient) {
		Client client = cs.searchClientById(idClient);
		System.out.println(client.toString());
		
	}
	public void showAllClient() {
		ArrayList<Client> n = new ArrayList<>();
		n = cs.getAllClient();
		for(Client c : n) {
			System.out.print(c.toString());
		}
	}

}
