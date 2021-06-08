package fr.utbm.core.controller;



import java.util.ArrayList;

import fr.utbm.core.entity.Client;
import fr.utbm.core.entity.CourseSession;
import fr.utbm.core.entity.Course;
import fr.utbm.core.entity.Location;
import fr.utbm.core.service.CourseService;



public class ShowCourseController {

	public CourseService cs = new CourseService();
	
	public void showCourse(String codeCourse) {
		
		Course course = cs.searchCourseByCode(codeCourse);
		
		System.out.println(course.toString());
	}
	
	public void showAllCourse() {
		ArrayList<Course> n = new ArrayList<>();
		n = cs.getAllCourse();
		for(Course c : n) {
			System.out.print(c.toString());
		}
	}
	
	public void showCourseByName(String name) {
		ArrayList<Course> n = new ArrayList<>();
		n = cs.getCourseByName(name);
		for(Course c : n) {
			System.out.print(c.toString());
		}
	}
	
	
}
