package fr.utbm.core.controller;



import java.util.List;

import com.hazelcast.core.Hazelcast;
import com.hazelcast.core.HazelcastInstance;
import com.hazelcast.core.IList;

import fr.utbm.core.entity.Course;
import fr.utbm.core.service.CourseService;



public class ShowCourseController {

	public CourseService cs = new CourseService();
	
	public void showCourse(String codeCourse) {
		
		Course course = cs.searchCourseByCode(codeCourse);
		
		System.out.println(course.toString());
	}
	
	public void showAllCourse() {
		HazelcastInstance hz = Hazelcast.newHazelcastInstance();
		
		IList<Course> list = hz.getList("listcourse"); 
		List<Course> n = cs.getAllCourse();
		for(Course c : n) {
			list.add(c);
		}
	}
	
	
}
