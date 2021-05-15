package fr.utbm.core.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "COURSE")
public class Course {
	
	@Id
	@Column(name = "CODE", unique = true, nullable = false)
	private String code;
	
	@Column(name = "TITLE")
	private String title;
	
	public Course() {
	}
	public Course(String code, String title) {
		super();
		this.code = code;
		this.title = title;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	
}