package com.mindtree.shoppingCart.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mindtree.shoppingCart.model.User;
import com.mindtree.shoppingCart.service.UserService;



@RestController
public class UserController {

	
	@Autowired
	private UserService service;
	
	@PostMapping("/adduser")
	public User addUser(@RequestBody User user) {
		return service.saveUser(user);
	}

	@PostMapping("/addusers")
	public List<User> addUsers(@RequestBody List<User> users){
		return service.saveUsers(users);
	}
	
	@GetMapping("/allUsers")
	public List<User> findAllUsers(){
		return (List<User>) service.getUsers();
	}
	
}
