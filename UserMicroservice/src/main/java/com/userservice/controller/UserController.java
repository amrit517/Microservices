package com.userservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.userservice.dao.Userdao;
import com.userservice.entity.User;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	public Userdao userdao;
	
	
	@GetMapping("/{id}")
	public User getUser(@PathVariable("id") Long userId) {
		return userdao.getUser(userId);
		
	}
	

}
