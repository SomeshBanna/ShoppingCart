package com.mindtree.shoppingCart.repository;

import org.springframework.data.repository.CrudRepository;

import com.mindtree.shoppingCart.model.Cart;

public interface CartRepository extends CrudRepository<Cart,Integer>{

	

}
