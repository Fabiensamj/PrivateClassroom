package fr.utbm.core.entity;

import java.sql.Time;
import java.util.Date;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "course_session")
public class CourseSession implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private Long id;
	
	private Date date;
	
	private Time start_h;
	
	private Time end_h;
	
	private int max;
	
	private String courseCode;
	
	private Long locationId;

	
	public CourseSession() {
	}
	public CourseSession(Long id) {
		super();
		this.id = id;
	}

	public CourseSession(Long id,Date date, Time start_h, Time end_h, int max, String courseCode, Long locationId) {
		this.id = id;
		this.date = date;
		this.start_h = start_h;
		this.end_h = end_h;
		this.max = max;
		this.courseCode = courseCode;
		this.locationId = locationId;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Time getStart_h() {
		return start_h;
	}
	public void setStart_h(Time start_h) {
		this.start_h = start_h;
	}
	public Time getEnd_h() {
		return end_h;
	}
	public void setEnd_h(Time end_h) {
		this.end_h = end_h;
	}
	public int getMax() {
		return max;
	}
	public void setMax(int max) {
		this.max = max;
	}
	public String getCourseCode() {
		return courseCode;
	}
	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}
	public Long getLocationId() {
		return locationId;
	}
	public void setLocationId(Long locationId) {
		this.locationId = locationId;
	}
	
	@Override
	public String toString() {
		return "CourseSession [id=" + id + ", date=" + date + ", start_h=" + start_h + ", end_h=" + end_h + ", max=" + max + ", courseCode=" + courseCode + ", locationId=" + locationId + "]";
	}
	
}