package com.contactservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.contactservice.dao.ContactDao;
import com.contactservice.entity.Contact;


@RestController
@RequestMapping("/contact")
public class ContactController {
	
	@Autowired
	public ContactDao contactDao;
	
	
	@GetMapping("/user/{id}")
	public List<Contact> getContactList(@PathVariable("id") Long userId){
		
		return contactDao.getcontactList(userId);
		
		
		
	}
	
	

}
