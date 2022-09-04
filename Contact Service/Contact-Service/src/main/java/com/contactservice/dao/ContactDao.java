package com.contactservice.dao;

import java.util.List;
import com.contactservice.entity.Contact;


public interface ContactDao {
	
	public List<Contact> getcontactList(Long Userid);

}
