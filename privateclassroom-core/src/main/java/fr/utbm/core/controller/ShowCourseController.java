package fr.utbm.core.controller;



import java.util.ArrayList;

import fr.utbm.core.entity.Course;
import fr.utbm.core.entity.Location;
import fr.utbm.core.service.CourseService;



public class ShowCourseController {

	public CourseService cs = new CourseService();
	
	public void showCourse() {
		
		Course course = cs.searchCourseByCode("AG51");
		
		System.out.println(course.toString());
	}
	
	public void showLocation(Long idLocation) {
		Location location = cs.searchLocationById(idLocation);
		System.out.println(location.toString());
		
	}
	public void showAllLocation() {
		ArrayList<Location> n = new ArrayList<>();
		n = cs.getAllLocation();
		for(Location l : n) {
			System.out.print(l.toString());
		}
		}
}
