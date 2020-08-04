package com.hari.roommiesapi.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hari.roommiesapi.dao.UserDAO;
import com.hari.roommiesapi.entity.User;
import com.hari.roommiesapi.service.UserService;

@RestController
@RequestMapping("/roomies")
public class RoomiesController {


	private UserService userService;

	@Autowired
	public RoomiesController(UserService userService) {
		super();
		this.userService = userService;
	}

	@GetMapping("/users")
	public List<User> getUsers(){
		return userService.getAllUsers();
	}
	
	@GetMapping("/users/{userId}")
	public User getUser(@PathVariable String userId){
		return userService.getUser(userId);
	}
	
	@PostMapping("/users")
	public User addUser(@RequestBody User user){
		return userService.addUser(user);
	}
	
	@PutMapping("/users")
	public User update(@RequestBody User user){
		return userService.updateUser(user);
	}
	
	@DeleteMapping("/users/{userId}")
	public void deleteUser(@PathVariable String userId){
		userService.deleteUser(userId);
	}
	
}
