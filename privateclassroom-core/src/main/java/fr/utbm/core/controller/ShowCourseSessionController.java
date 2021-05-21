package fr.utbm.core.controller;

import java.util.ArrayList;
import java.sql.Time;
import java.util.Date;

import fr.utbm.core.entity.Client;
import fr.utbm.core.entity.CourseSession;
import fr.utbm.core.entity.Course;
import fr.utbm.core.entity.Location;
import fr.utbm.core.service.CourseService;
import fr.utbm.core.service.CourseSessionService;

public class ShowCourseSessionController {
	
	public CourseSessionService css = new CourseSessionService();
	
	public void showCourseSession(Long idCourseSession) {
		CourseSession course_session = css.searchCourseSessionById(idCourseSession);
		System.out.println(course_session.toString());
		
	}
	public void showAllCourseSession() {
		ArrayList<CourseSession> n = new ArrayList<>();
		n = css.getAllCourseSession();
		for(CourseSession s : n) {
			System.out.print(s.toString());
		}
	}
	public void showCourseSessionByDate(Date date) {
		ArrayList<CourseSession> n = new ArrayList<>();
		n = css.getCourseSessionByDate(date);
		for(CourseSession s : n) {
			System.out.print(s.toString());
		}
	}

}
