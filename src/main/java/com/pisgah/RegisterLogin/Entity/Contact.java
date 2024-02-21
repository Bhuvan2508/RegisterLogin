package com.pisgah.RegisterLogin.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name="contact")
public class Contact {
	@Id
	@Column(name="conract_id" , length=45)
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	@SequenceGenerator(name="conract_id",sequenceName="conract_id", allocationSize=1)
	private int contactid;

	
	@Column(name="contact_name" , length=255)
	private String contactname;
	
	@Column(name="email" , length=255)
	private String email;
	
	@Column(name="subject" , length=255)
	private String subject;
	
	@Column(name="phone" , length=255)
	private String phone;
	
	@Column(name="message" , length=255)
	private String message;

	public Contact(int contactid, String contactname, String email, String subject, String phone, String message) {
		this.contactid = contactid;
		this.contactname = contactname;
		this.email = email;
		this.subject = subject;
		this.phone = phone;
		this.message = message;
	}

	public Contact() {
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
		return "Contact [contactid=" + contactid + ", contactname=" + contactname + ", email=" + email + ", subject="
				+ subject + ", phone=" + phone + ", message=" + message + "]";
	}
	
	
	
}
