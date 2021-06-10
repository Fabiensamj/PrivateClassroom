package fr.utbm.core.service;

import java.util.ArrayList;
import java.sql.Time;
import java.util.Date;

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
	
	public ArrayList<CourseSession> getCourseSessionByDate(Date date){
		this.csDao = new CourseSessionDao();
		return csDao.getCourseSessionByDate(date);
	}
	
	public ArrayList<CourseSession> getCourseSessionByCode(String code){
		this.csDao = new CourseSessionDao();
		return csDao.getCourseSessionByCode(code);
	}

}
