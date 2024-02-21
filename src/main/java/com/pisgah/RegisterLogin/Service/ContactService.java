package com.pisgah.RegisterLogin.Service;

import java.util.List;

import com.pisgah.RegisterLogin.Dto.ContactDTO;
import com.pisgah.RegisterLogin.Entity.Contact;

public interface ContactService {
	 String addContact(ContactDTO contactDTO);

	List<Contact> fetchAllContacts();
}
