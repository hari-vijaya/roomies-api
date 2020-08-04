package com.hari.roommiesapi.service;

import java.util.List;

import com.hari.roommiesapi.entity.User;

public interface UserService {

	public List<User> getAllUsers();
	
	public User addUser(User user);
	
	public User getUser(String userId);
	
	public User updateUser(User user);
	
	public void deleteUser(String userId);
	
}
