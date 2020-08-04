package com.hari.roommiesapi.dao;

import java.util.List;

import com.hari.roommiesapi.entity.User;

public interface UserDAO {

	public List<User> getAllUsers();
	
	public User addUser(User user);
	
	public User getUser(String userId);
	
	public User updateUser(User user);
	
	public void deleteUser(User user);
	
}
