package com.contactservice.dao;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.contactservice.entity.Contact;

@Service
public class ContactDaoImple implements ContactDao {
	
	
	List<Contact> contactList = List.of(
		new Contact(1998, "Amrit@gmail.com", "Amritpal Singh", 10001),
		new Contact(1998, "Amrit@gmail.com", "Amritpal", 10001),
		new Contact(1998, "Amrit@gmail.com", "Amrita Singh", 10002),
		new Contact(1998, "Amrit@gmail.com", "Ajaay Singh", 10003),
		new Contact(1998, "Amrit@gmail.com", "sharma Singh", 10004),
		new Contact(1998, "Amrit@gmail.com", "Amritpal Singh", 10005),
		new Contact(1998, "Amrit@gmail.com", "Amritpal Singh", 10006),
		new Contact(1998, "Amrit@gmail.com", "Amritpal Singh", 10007),
		new Contact(1998, "Amrit@gmail.com", "Shivai Singh", 10008),
		new Contact(1998, "Amrit@gmail.com", "Amritpal Singh", 10009),
		new Contact(1998, "Amrit@gmail.com", "Amritpal Singh", 10010),
		new Contact(1998, "Amrit@gmail.com", "Amritpal Singh", 10011)
			);

	@Override
	public List<Contact> getcontactList(Long Userid) {
		return this.contactList.stream().filter(contact -> contact.getUserId() == Userid).collect(Collectors.toList());
	}
	
	

}
