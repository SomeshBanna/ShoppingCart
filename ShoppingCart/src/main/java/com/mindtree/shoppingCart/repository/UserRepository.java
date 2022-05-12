package com.mindtree.shoppingCart.repository;



import org.springframework.data.repository.CrudRepository;

import com.mindtree.shoppingCart.model.User;


public interface UserRepository extends CrudRepository<User, Integer> {

}