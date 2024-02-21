package com.pisgah.RegisterLogin.Dto;

public class TrainingDTO {
	private int trainingid;
	private int courseid;
	private String courseduration;
	private String coursetime;
	private String coursedetails;
	private String email;
	public TrainingDTO(int trainingid, int courseid, String courseduration, String coursetime, String coursedetails,
			String email) {
		this.trainingid = trainingid;
		this.courseid = courseid;
		this.courseduration = courseduration;
		this.coursetime = coursetime;
		this.coursedetails = coursedetails;
		this.email = email;
	}
	public TrainingDTO() {
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
		return "TrainingDTO [trainingid=" + trainingid + ", courseid=" + courseid + ", courseduration=" + courseduration
				+ ", coursetime=" + coursetime + ", coursedetails=" + coursedetails + ", email=" + email + "]";
	}

	
	
	
}
