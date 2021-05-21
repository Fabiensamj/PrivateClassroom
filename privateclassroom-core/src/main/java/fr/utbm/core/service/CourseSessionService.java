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

public class CourseSessionService {
	
	private CourseSessionDao csDao;
	
	public CourseSession searchCourseSessionById(Long id) {
		this.csDao = new CourseSessionDao();
		return csDao.getCourseSessionById(id);
	}
	
	public ArrayList<CourseSession> getAllCourseSession(){
		this.csDao = new CourseSessionDao();
		return csDao.getAllCourseSession();
	}

}
