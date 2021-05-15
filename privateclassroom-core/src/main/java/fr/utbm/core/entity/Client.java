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
@Table(name = "CLIENT")
public class Client implements Serializable {
	
	
    private static final long serialVersionUID = 1L ;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Long id;
    
    @Column(name = "LASTNAME")
    private String lastname ;
    
    @Column(name = "FIRSTNAME")
    private String firstname ;
    
    @Column(name = "ADDRESS")
    private String address ;
    
    @Column(name = "PHONE")
    private String phone ;

    @Column(name = "EMAIL")
    private String email ;
    
    @Column(name = "COURSE_SESSION_ID")
    private Long courseSessionId ;
    
    public Client(Long id) {
        super();
        this.id = id;
    }
    
    public Client(String lastname, String firstname, String address, String phone, String email, Long courseSessionId) {
        super();
        this.lastname = lastname;
        this.firstname = firstname;
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.courseSessionId = courseSessionId;
    }

    public Client(Long id, String lastname, String firstname, String address, String phone, String email,
            Long courseSessionId) {
        super();
        this.id = id;
        this.lastname = lastname;
        this.firstname = firstname;
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.courseSessionId = courseSessionId;
    }
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getCourseSessionId() {
        return courseSessionId;
    }

    public void setCourseSessionId(Long courseSessionId) {
        this.courseSessionId = courseSessionId;
    }
    
}
