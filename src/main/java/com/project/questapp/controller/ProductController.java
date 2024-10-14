package com.project.questapp.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.project.questapp.model.Product;
import com.project.questapp.service.ProductService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping
public class ProductController {
	
	@Autowired
	private ProductService productService;
	
	@GetMapping("/urun")
	public List<Product> getAllProducts(){
		return productService.getAllProducts();
	}
	
	@PostMapping("/urun")
	public String createProduct(@RequestBody Product product) {	
		String createMsg=" Başarıyla Eklendi \n ";
		 productService.createProduct(product);
		 return createMsg + product ;
	}
	
//	@PutMapping("urun/{id}")
//	public String updateProduct(@PathVariable Long id, @RequestBody Product requestProduct) {
//		Product productObj=productService.getById(id);
//		String updateMsg=" Başarıyla Güncellendi \n ";
//		if(productObj!=null) {
//			productObj.setFirstName(requestProduct.getFirstName());
//			productObj.setLastName(requestProduct.getLastName());
//			productObj.setEmail(requestProduct.getEmail());
//		}		
//		 productService.updateProduct(productObj);
//	return  updateMsg + productObj;
//	}
	
	@PutMapping("urun/{id}")
	public Product updateProduct(@PathVariable Long id, @RequestBody Product requestProduct) {
		return  productService.updateProduct(requestProduct);
		}
	
	
	@DeleteMapping("urun/{id}")
	public String deleteProduct(@PathVariable Long id) {
		Product productObj=productService.getById(id);
		String deleteMsg="Başarıyla Silindi \n"+productObj;
		if(productObj!=null) {
			deleteMsg=productService.deleteProduct(productObj);
		}
	return deleteMsg + productObj;
	}

}
