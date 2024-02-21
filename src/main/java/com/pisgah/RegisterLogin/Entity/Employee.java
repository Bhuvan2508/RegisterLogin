package com.pisgah.RegisterLogin.Entity;

import java.io.File;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name="employee")
public class Employee {
	
	@Id
	@Column(name="employee_id" , length=45)
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	@SequenceGenerator(name="employee_id",sequenceName="employee_id", allocationSize=1)
	private int employeeid;
	
	@Column(name="employee_name" , length=255)
	private String employeename;
	
	@Column(name="email" , length=255)
	private String email;
	
	@Column(name="number" , length=255)
	private String number;
	
	@Column(name="password" , length=255)
	private String password;
	
	@Column(name="password1" , length=255)
	private String password1;

	@Column(name="education" , length=255)
	private String education;
	
	@Column(name="skills" , length=500 )
	 private String skills;
	
	@Column(name="nonitskills" , length=255)
	private String nonitskills;
	
	@Column(name="othercertifications" , length=255)
	private String othercertifications;
	
	@Column(name="totalyearsofexp" , length=255)
	private String totalyearsofexp;
	
	@Column(name="totalyearsofindexp" , length=255)
	private String totalyearsofindexp;
	
	@Column(name="nubofclients" , length=255)
	private String nubofclients;
	
	@Column(name="trainings" , length=255)
	private String trainings;
	
	@Column(name="pdffile" )
	 private File pdffile;
	
	@Column(name="quetionone" , length=255)
	private String quetionone;
	
	@Column(name="quetiontwo" , length=255)
	private String quetiontwo;

	public Employee(int employeeid, String employeename, String email, String number, String password, String password1,
			String education, String skills, String nonitskills, String othercertifications,
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

	public Employee() {
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
		return "Employee [employeeid=" + employeeid + ", employeename=" + employeename + ", email=" + email
				+ ", number=" + number + ", password=" + password + ", password1=" + password1 + ", education="
				+ education + ", skills=" + skills + ", nonitskills=" + nonitskills + ", othercertifications="
				+ othercertifications + ", totalyearsofexp=" + totalyearsofexp + ", totalyearsofindexp="
				+ totalyearsofindexp + ", nubofclients=" + nubofclients + ", trainings=" + trainings + ", pdffile="
				+ pdffile + ", quetionone=" + quetionone + ", quetiontwo=" + quetiontwo + "]";
	}

	

}
