package com.pisgah.RegisterLogin.Dto;

public class ContactDTO {

    private int contactid;
	private String contactname;
	private String email;	
	private String subject;	
	private String phone;	
	private String message;
	public ContactDTO(int contactid, String contactname, String email, String subject, String phone, String message) {
		this.contactid = contactid;
		this.contactname = contactname;
		this.email = email;
		this.subject = subject;
		this.phone = phone;
		this.message = message;
	}
	public ContactDTO() {
	}
	public int getContactid() {
		return contactid;
	}
	public void setContactid(int contactid) {
		this.contactid = contactid;
	}
	public String getContactname() {
		return contactname;
	}
	public void setContactname(String contactname) {
		this.contactname = contactname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	@Override
	public String toString() {
		return "ContactDTO [contactid=" + contactid + ", contactname=" + contactname + ", email=" + email + ", subject="
				+ subject + ", phone=" + phone + ", message=" + message + "]";
	}
	
}
