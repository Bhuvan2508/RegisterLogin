package com.pisgah.RegisterLogin.Dto;

public class CourseDTO {

	private int courseid;
	private String courseduration;
	private String coursetime;
	private String coursedetails;
	public CourseDTO(int courseid, String courseduration, String coursetime, String coursedetails) {
		
		this.courseid = courseid;
		this.courseduration = courseduration;
		this.coursetime = coursetime;
		this.coursedetails = coursedetails;
	}
	public CourseDTO() {
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
		return "CourseDTO [courseid=" + courseid + ", courseduration=" + courseduration + ", coursetime=" + coursetime
				+ ", coursedetails=" + coursedetails + "]";
	}
	
	
	
}
