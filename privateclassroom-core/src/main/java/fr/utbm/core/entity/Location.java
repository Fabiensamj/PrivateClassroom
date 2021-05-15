package fr.utbm.core.entity;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="location")
public class Location implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
	@Column(name = "id")
	private Long id;
	
	

	@Column(name = "city")
	private String city;
	
	
	public Location() {
	}

	public Location(Long id, String city) {
		super();
		this.id = id;
		this.city = city;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Location [id=" + id + ", city=" + city + "]";
	}
}