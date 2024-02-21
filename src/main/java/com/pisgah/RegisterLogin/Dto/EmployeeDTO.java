package com.pisgah.RegisterLogin.Dto;

import java.io.File;

public class EmployeeDTO {
	
	private int employeeid;
	private String employeename;
	private String email;
	private String number;
	private String password;
	private String password1;
	private String education;
	private String skills;
	private String nonitskills;
	private String othercertifications;
	private String totalyearsofexp;
	private String totalyearsofindexp;
	private String nubofclients;
	private String trainings;
	private File pdffile;
	private String quetionone;
	private String quetiontwo;
	public EmployeeDTO(int employeeid, String employeename, String email, String number, String password,
			String password1, String education, String skills, String nonitskills, String othercertifications,
			String totalyearsofexp, String totalyearsofindexp, String nubofclients, String trainings, File pdffile,
			String quetionone, String quetiontwo) {
		this.employeeid = employeeid;
		this.employeename = employeename;
		this.email = email;
		this.number = number;
		this.password = password;
		this.password1 = password1;
		this.education = education;
		this.skills = skills;
		this.nonitskills = nonitskills;
		this.othercertifications = othercertifications;
		this.totalyearsofexp = totalyearsofexp;
		this.totalyearsofindexp = totalyearsofindexp;
		this.nubofclients = nubofclients;
		this.trainings = trainings;
		this.pdffile = pdffile;
		this.quetionone = quetionone;
		this.quetiontwo = quetiontwo;
	}
	public EmployeeDTO() {
	}
	public int getEmployeeid() {
		return employeeid;
	}
	public void setEmployeeid(int employeeid) {
		this.employeeid = employeeid;
	}
	public String getEmployeename() {
		return employeename;
	}
	public void setEmployeename(String employeename) {
		this.employeename = employeename;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPassword1() {
		return password1;
	}
	public void setPassword1(String password1) {
		this.password1 = password1;
	}
	public String getEducation() {
		return education;
	}
	public void setEducation(String education) {
		this.education = education;
	}
	public String getSkills() {
		return skills;
	}
	public void setSkills(String skills) {
		this.skills = skills;
	}
	public String getNonitskills() {
		return nonitskills;
	}
	public void setNonitskills(String nonitskills) {
		this.nonitskills = nonitskills;
	}
	public String getOthercertifications() {
		return othercertifications;
	}
	public void setOthercertifications(String othercertifications) {
		this.othercertifications = othercertifications;
	}
	public String getTotalyearsofexp() {
		return totalyearsofexp;
	}
	public void setTotalyearsofexp(String totalyearsofexp) {
		this.totalyearsofexp = totalyearsofexp;
	}
	public String getTotalyearsofindexp() {
		return totalyearsofindexp;
	}
	public void setTotalyearsofindexp(String totalyearsofindexp) {
		this.totalyearsofindexp = totalyearsofindexp;
	}
	public String getNubofclients() {
		return nubofclients;
	}
	public void setNubofclients(String nubofclients) {
		this.nubofclients = nubofclients;
	}
	public String getTrainings() {
		return trainings;
	}
	public void setTrainings(String trainings) {
		this.trainings = trainings;
	}
	public File getPdffile() {
		return pdffile;
	}
	public void setPdffile(File pdffile) {
		this.pdffile = pdffile;
	}
	public String getQuetionone() {
		return quetionone;
	}
	public void setQuetionone(String quetionone) {
		this.quetionone = quetionone;
	}
	public String getQuetiontwo() {
		return quetiontwo;
	}
	public void setQuetiontwo(String quetiontwo) {
		this.quetiontwo = quetiontwo;
	}
	@Override
	public String toString() {
		return "EmployeeDTO [employeeid=" + employeeid + ", employeename=" + employeename + ", email=" + email
				+ ", number=" + number + ", password=" + password + ", password1=" + password1 + ", education="
				+ education + ", skills=" + skills + ", nonitskills=" + nonitskills + ", othercertifications="
				+ othercertifications + ", totalyearsofexp=" + totalyearsofexp + ", totalyearsofindexp="
				+ totalyearsofindexp + ", nubofclients=" + nubofclients + ", trainings=" + trainings + ", pdffile="
				+ pdffile + ", quetionone=" + quetionone + ", quetiontwo=" + quetiontwo + "]";
	}
	

	
}
