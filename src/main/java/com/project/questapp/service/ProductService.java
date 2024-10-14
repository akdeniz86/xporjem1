package com.project.questapp.service;

import java.util.List;
import com.project.questapp.model.Product;

public interface ProductService {
	
	List<Product> getAllProducts();
	Product createProduct(Product product);
	Product updateProduct(Product product);
	String deleteProduct(Product product);	
	Product getById(Long id);
	
}
