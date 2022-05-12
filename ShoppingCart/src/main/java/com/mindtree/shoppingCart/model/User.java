package com.mindtree.shoppingCart.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity 
public class User {
  @Id
  private Integer id;
  
  private String name;
  private String email;
  @OneToOne(cascade = CascadeType.ALL)
  @JoinColumn(name="cart_id")
  private Cart cart;
  

  public User() {
	
}
  

public User(Integer id, String name, String email, Cart cart) {
	
	this.id = id;
	this.name = name;
	this.email = email;
	this.cart = cart;
}


public Integer getId() {
	return id;
}


public void setId(Integer id) {
	this.id = id;
}


public String getName() {
	return name;
}


public void setName(String name) {
	this.name = name;
}


public String getEmail() {
	return email;
}


public void setEmail(String email) {
	this.email = email;
}


public Cart getCart() {
	return cart;
}


public void setCart(Cart cart) {
	this.cart = cart;
}



}