package fr.utbm.core.controller;

import java.util.ArrayList;

import fr.utbm.core.entity.Client;
import fr.utbm.core.entity.CourseSession;
import fr.utbm.core.entity.Course;
import fr.utbm.core.entity.Location;
import fr.utbm.core.service.CourseService;
import fr.utbm.core.service.LocationService;

public class ShowLocationController {
	
	public LocationService ls = new LocationService();
	
	public void showLocation(Long idLocation) {
		Location location = ls.searchLocationById(idLocation);
		System.out.println(location.toString());
		
	}
	public void showAllLocation() {
		ArrayList<Location> n = new ArrayList<>();
		n = ls.getAllLocation();
		for(Location l : n) {
			System.out.print(l.toString());
		}
	}

}
