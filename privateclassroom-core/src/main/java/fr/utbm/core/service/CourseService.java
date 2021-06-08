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

public class CourseService {
	
	private CourseDao courseDao;
	
	public Course searchCourseByCode(String code) {
		this.courseDao = new CourseDao();
		return courseDao.getCourseByCode(code);
	}
	
	public ArrayList<Course> getAllCourse(){
		this.courseDao = new CourseDao();
		return courseDao.getAllCourse();
	}
	
	public ArrayList<Course> getCourseByName(String name){
		this.courseDao = new CourseDao();
		return courseDao.getCourseByName(name);
	}

}
