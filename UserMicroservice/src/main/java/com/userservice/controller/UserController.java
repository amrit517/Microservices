package com.userservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.userservice.dao.Userdao;
import com.userservice.entity.Contact;
import com.userservice.entity.User;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	public Userdao userdao;

	@Autowired
	public RestTemplate restTemplate;

	@GetMapping("/{id}")
	public User getUser(@PathVariable("id") Long userId) {

		User user = userdao.getUser(userId);

		String url = "http://localhost:8002/contact/user/" + user.getUserId();
		
		

		List<Contact> contactList = restTemplate.getForObject(url, List.class);

		user.setContacts(contactList);

		return user;

	}

}
