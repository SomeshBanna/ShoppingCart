package com.mindtree.shoppingCart.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mindtree.shoppingCart.model.Cart;
import com.mindtree.shoppingCart.service.CartService;


@RestController
public class CartController {

	
	@Autowired
	private CartService service;
	
	@PostMapping("/addcart")
	public Cart addCart(@RequestBody Cart cart) {
		return service.saveCart(cart);
	}
	
	@PostMapping("/addcarts")
	public List<Cart> addCarts(@RequestBody List<Cart> carts){
		return service.saveCarts(carts);
	}
	 
	
	@PutMapping("/update")
		public Cart updateCart(@RequestBody Cart cart) {
			return service.updateCart(cart);
		}
	
	
	}
	

