package com.project.questapp.serviceImpl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.project.questapp.model.Product;
import com.project.questapp.repository.ProductRepo;
import com.project.questapp.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {
	
	@Autowired
	private ProductRepo productRepo;

	@Override
	public List<Product> getAllProducts() {
		return productRepo.findAll();
	}

	@Override
	public Product createProduct(Product product) {		
		return productRepo.save(product);
	}

	@Override
	public Product updateProduct(Product product) {
		return productRepo.save(product);
	}

	@Override
	public String deleteProduct(Product product) {
		 productRepo.delete(product);
		 return "product silindi id:"+product.getId();
	}

	@Override
	public Product getById(Long id) {		
		return productRepo.findById(id).get();
	}

}
