package com.tech11.service;

import java.util.List;

import com.tech11.entity.User;


public interface UserService {
	
	User createUser(User user);
	
	User updateUser(User user);
	
	List<User> findAll();
	
	User getUserById(long userId);
	
	void deleteUser(long userId);
	
	
	
}
