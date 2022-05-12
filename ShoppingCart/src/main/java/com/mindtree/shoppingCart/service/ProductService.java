package com.mindtree.shoppingCart.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.shoppingCart.model.Product;
import com.mindtree.shoppingCart.repository.ProductRepository;

@Service
public class ProductService {
  @Autowired 
  private ProductRepository repository;
  
  public Product saveProduct(Product product) {
	  return repository.save(product);
  }
  public List<Product> saveProducts(List<Product> products){
	  return (List<Product>) repository.saveAll(products);
  }
  
  public Optional<Product> getProductById(int id) {
	  return repository.findById(id);
  }
  
  public List<Product> getProducts(){
	  return (List<Product>) repository.findAll();
  }
  
  
  public String deleteProduct(int id) {
	  repository.deleteById(id);
	  return "product removed!!"+ id;
  }
  
	
}
