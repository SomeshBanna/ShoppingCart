package com.mindtree.shoppingCart.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Cart {
	
@Id
private int cartId;

public int productQuantities;
public int totalPrice;

@OneToMany(targetEntity =Product.class,cascade =CascadeType.ALL)
@JoinColumn(name="cp_fk", referencedColumnName="cartId")
private List<Product> product;

public int getCartId() {
	return cartId;
}

public void setCartId(int cartId) {
	this.cartId = cartId;
}

public int getProductQuantities() {
	return productQuantities;
}

public void setProductQuantities(int productQuantities) {
	this.productQuantities = productQuantities;
}

public int getTotalPrice() {
	return totalPrice;
}

public void setTotalPrice(int totalPrice) {
	this.totalPrice = totalPrice;
}

public List<Product> getProduct() {
	return product;
}

public void setProduct(List<Product> product) {
	this.product = product;
}
}


