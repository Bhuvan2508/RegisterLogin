package com.pisgah.RegisterLogin.Dto;

public class PasswordDTO {
	private  String email;
	private String questionone;
	private  String questiontwo;
	public PasswordDTO(String email, String questionone, String questiontwo) {
		this.email = email;
		this.questionone = questionone;
		this.questiontwo = questiontwo;
	}
	public PasswordDTO() {
	}
	public  String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getquestionone() {
		return questionone;
	}
	public void setquestionone(String questionone) {
		this.questionone = questionone;
	}
	public  String getquestiontwo() {
		return questiontwo;
	}
	public void setquestiontwo(String questiontwo) {
		this.questiontwo = questiontwo;
	}
	
	@Override
	public String toString() {
		return "PasswordDTO [email=" + email + ", questionone=" + questionone + ", questiontwo=" + questiontwo
				+ "]";
	}
	
	
	
}
