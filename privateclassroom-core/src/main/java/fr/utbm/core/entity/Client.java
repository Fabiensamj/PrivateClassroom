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
@Table(name = "client")
public class Client implements Serializable {
	
	
    private static final long serialVersionUID = 1L ;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Long id;
    
    @Column(name = "lastname")
    private String lastname ;
    
    @Column(name = "firstname")
    private String firstname ;
    
    @Column(name = "address")
    private String address ;
    
    @Column(name = "phone")
    private String phone ;

    @Column(name = "email")
    private String email ;
    
    @Column(name = "course_session_id")
    private Long courseSessionId ;
    
    public Client(Long id) {
        super();
        this.id = id;
    }
    public Client() {
    	
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
    
    @Override
	public String toString() {
		return "Client [id=" + id + ", lastname=" + lastname + ", firstname=" + firstname + ",adress=" + address + ",phone=" + phone + ",email=" + email + ",course_session_id=" + courseSessionId + "]";
	}
    
}
