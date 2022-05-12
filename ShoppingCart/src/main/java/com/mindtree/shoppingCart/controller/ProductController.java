package com.mindtree.shoppingCart.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mindtree.shoppingCart.model.Product;
import com.mindtree.shoppingCart.service.ProductService;

@RestController
public class ProductController {
@Autowired
private ProductService service;

@PostMapping("/addproduct")
public Product addProduct(@RequestBody Product product) {
	return service.saveProduct(product);
}

@PostMapping("/addproducts")
public List<Product> addProducts(@RequestBody List<Product> products){
	return service.saveProducts(products);
}

@GetMapping("/product/{id}")
public Optional<Product> findProductById(@PathVariable int id) {
	return service.getProductById(id);
}


@GetMapping("/products")
public List<Product> findAllProducts(){
	return service.getProducts();
}

@DeleteMapping("/delete/{id}")
public String deleteProduct(@PathVariable int id) {

	return service.deleteProduct(id);
	
}
}
