package com.pisgah.RegisterLogin.Service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pisgah.RegisterLogin.Dto.ContactDTO;
import com.pisgah.RegisterLogin.Entity.Contact;
import com.pisgah.RegisterLogin.Repo.ContactRepo;
import com.pisgah.RegisterLogin.Service.ContactService;
@Service
public class ContactIMPL implements ContactService{
	@Autowired
	private ContactRepo contactRepo;

	@Override
	public String addContact(ContactDTO contactDTO) {
		String msg;
		  Contact contact = new Contact(
	        
	        contactDTO.getContactid(),
	        contactDTO.getContactname(),
	        contactDTO.getEmail(),
	        contactDTO.getSubject(),
	        contactDTO.getPhone(),
	        contactDTO.getMessage()
				  );
		  if((contactDTO.getContactname()==null) || (contactDTO.getEmail()==null) || (contactDTO.getSubject()==null)
				  || (contactDTO.getPhone()==null) || (contactDTO.getMessage()==null)) {
		       
			return msg = "NOT SAVED";			
	}
	else {
		contactRepo.save(contact); 
		return msg="SAVED";
	}
		
	}

	@Override
	public List<Contact> fetchAllContacts() {
		List<Contact> ls=contactRepo.findAll();
		return ls;
	}

}
