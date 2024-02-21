package com.pisgah.RegisterLogin.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name="course")
public class Course {
	@Id
	@Column(name="course_id" , length=45)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@SequenceGenerator(name="course_id",sequenceName="course_id", allocationSize=1)
	private int courseid;
	
	@Column(name="course_duration" , length=255)
	private String courseduration;
	
	
	@Column(name="course_time")
	private String coursetime;
	
	@Column(name="course_details" , length=255)
	private String coursedetails;

	public Course(int courseid, String courseduration, String coursetime, String coursedetails) {
		this.courseid = courseid;
		this.courseduration = courseduration;
		this.coursetime = coursetime;
		this.coursedetails = coursedetails;
	}

	public Course() {
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

	@Override
	public String toString() {
		return "Course [courseid=" + courseid + ", courseduration=" + courseduration + ", coursetime=" + coursetime
				+ ", coursedetails=" + coursedetails + "]";
	}
	
	
	
	
}
