package com.mindtree.shoppingCart.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.shoppingCart.model.Cart;
import com.mindtree.shoppingCart.repository.CartRepository;

@Service
public class CartService {
@Autowired
private CartRepository repository;

public Cart saveCart(Cart cart) {
	return repository.save(cart);
}
public List<Cart> saveCarts(List<Cart> carts){
	return (List<Cart>) repository.saveAll(carts);
}
public Cart updateCart(Cart cart) {
	Cart existingCart=repository.findById(cart.getCartId()).orElse(cart);
	existingCart.setProductQuantities(cart.getProductQuantities());
	existingCart.setTotalPrice(cart.getTotalPrice());
	return repository.save(existingCart);
}

}
