package com.userservice.dao;

import java.util.List;

import org.springframework.stereotype.Service;

import com.userservice.entity.User;

@Service
public class UserdaoImple implements Userdao {
	
	List<User> userList = List.of(
			new User(10001,"Amrit", "8196040498"),
			new User(10001,"Amrita", "8196040498"),
			new User(10003,"Ajay", "8196040498"),
			new User(10005,"Sergio", "8196040498"),
			new User(10006,"Sharma", "8196040498"),
			new User(10007,"tiwari", "8196040498"),
			new User(10008,"jamson", "8196040498"),
			new User(10009,"rahul", "8196040498"),
			new User(10010,"jessis", "8196040498"),
			new User(10011,"rama", "8196040498")
			);

	@Override
	public User getUser(Long userId) {
		
		return this.userList.stream().filter(user->user.getUserId()== userId).findAny().orElse(null);
	}
	
	

}
