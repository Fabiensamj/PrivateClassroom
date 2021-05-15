package fr.utbm.core.service;

import java.util.ArrayList;

import fr.utbm.core.entity.Course;
import fr.utbm.core.entity.Location;
import fr.utbm.core.repository.CourseDao;
import fr.utbm.core.repository.LocationDao;

public class CourseService {
	
	private CourseDao courseDao;
	private LocationDao lDao;
	
	public Course searchCourseByCode(String code) {
		this.courseDao = new CourseDao();
		return courseDao.getCourseByCode(code);
	}
	
	public Location searchLocationById(Long id) {
		this.lDao = new LocationDao();
		return lDao.getLocationById(id);
	}
	
	public ArrayList<Location> getAllLocation(){
		this.lDao = new LocationDao();
		return lDao.getAllLocation();
	}

}
