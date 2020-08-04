package com.hari.roommiesapi.service;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hari.roommiesapi.dao.UserDAO;
import com.hari.roommiesapi.entity.User;

@Service
public class UserServiceImpl implements UserService {

	
	private UserDAO userDAO;
	
	
	@Autowired
	public UserServiceImpl(UserDAO userDAO) {
		this.userDAO = userDAO;
	}

	@Override
	public List<User> getAllUsers() {
		return userDAO.getAllUsers();
	}

	@Override
	public User addUser(User user) {
		Date date= new Date();
		user.setInputDatetime(new Timestamp(date.getTime()));
		user.setLastUpdateDatetime(new Timestamp(date.getTime()));
		return userDAO.addUser(user);
	}

	@Override
	public User getUser(String userId) {
		return userDAO.getUser(userId);
	}

	@Override
	public User updateUser(User user) {
		Date date= new Date();
		user.setLastUpdateDatetime(new Timestamp(date.getTime()));
		return userDAO.updateUser(user);
	}

	@Override
	public void deleteUser(String userId) {
		User deleteUser = getUser(userId);
		userDAO.deleteUser(deleteUser);
	}

}
