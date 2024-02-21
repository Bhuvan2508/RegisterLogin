package com.pisgah.RegisterLogin.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;


@Entity
@Table(name="training")
public class Training {
	@Id
	@Column(name="training_id" , length=45)
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	@SequenceGenerator(name="training_id",sequenceName="training_id", allocationSize=1)
	private int trainingid;

	
	@Column(name="courseid" , length=255)
	private int courseid;
	
	@Column(name="course_duration" , length=255)
	private String courseduration;
	
	
	@Column(name="course_time")
	private String coursetime;
	
	@Column(name="course_details" , length=255)
	private String coursedetails;
	
	@Column(name="email" , length=255)
	private String email;

	public Training(int trainingid, int courseid, String courseduration, String coursetime, String coursedetails,
			String email) {
		this.trainingid = trainingid;
		this.courseid = courseid;
		this.courseduration = courseduration;
		this.coursetime = coursetime;
		this.coursedetails = coursedetails;
		this.email = email;
	}

	public Training() {
	}

	public int getTrainingid() {
		return trainingid;
	}

	public void setTrainingid(int trainingid) {
		this.trainingid = trainingid;
	}

	public int getCourseid() {
		return courseid;
	}

	public void setCourseid(int courseid) {
		this.courseid = courseid;
	}

	public String getCourseduration() {
		return courseduration;
	}

	public void setCourseduration(String courseduration) {
		this.courseduration = courseduration;
	}

	public String getCoursetime() {
		return coursetime;
	}

	public void setCoursetime(String coursetime) {
		this.coursetime = coursetime;
	}

	public String getCoursedetails() {
		return coursedetails;
	}

	public void setCoursedetails(String coursedetails) {
		this.coursedetails = coursedetails;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Training [trainingid=" + trainingid + ", courseid=" + courseid + ", courseduration=" + courseduration
				+ ", coursetime=" + coursetime + ", coursedetails=" + coursedetails + ", email=" + email + "]";
	}
	
	  
}
