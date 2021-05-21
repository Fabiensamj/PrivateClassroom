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


public class LocationService {
	
	private LocationDao lDao;
	
	public Location searchLocationById(Long id) {
		this.lDao = new LocationDao();
		return lDao.getLocationById(id);
	}
	
	public ArrayList<Location> getAllLocation(){
		this.lDao = new LocationDao();
		return lDao.getAllLocation();
	}
	
}
