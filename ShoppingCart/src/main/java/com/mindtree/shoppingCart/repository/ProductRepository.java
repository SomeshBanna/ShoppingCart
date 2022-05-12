package com.mindtree.shoppingCart.repository;

import org.springframework.data.repository.CrudRepository;

import com.mindtree.shoppingCart.model.Product;

public interface ProductRepository extends CrudRepository<Product, Integer> {

	

}
