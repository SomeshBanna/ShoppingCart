package com.mindtree.shoppingCart.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.shoppingCart.model.User;
import com.mindtree.shoppingCart.repository.UserRepository;

@Service
public class UserService {
	@Autowired
	private UserRepository repository;
	
	public User saveUser(User user) {
		  return repository.save(user);
	  }
	  public List<User> saveUsers(List<User> users){
		  return (List<User>) repository.saveAll(users);
	  }
	
	public List<User> getUsers(){
		return (List<User>) repository.findAll();
	}
	

}
