package com.algoDomain.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.algoDomain.model.Product;
import com.algoDomain.response.ProductDetailsResponse;
import com.algoDomain.service.ProductDetailsService;
import com.algoDomain.service.ProductService;

@RestController
@RequestMapping("/api")
public class ProductController {
	
	@Autowired
	private ProductService productService;
	
	@Autowired
	private ProductDetailsService productDetailsService;
	
	
	@PostMapping("/add")
	public Product addProduct(@RequestBody Product product) {
		
		return productService.addProduct(product);
		
	}
	
	@DeleteMapping("/remove")
	public void deleteProduct(@RequestBody Long id) {
		
		productService.removeProduct(id);
		
	}
	
	@GetMapping("/product/{id}")
	public Product showProductById(@PathVariable("id") Long id) {
		
		return productService.showProductById(id);
	}
	
	@GetMapping("/products")
	public List<Product> getAllProducts(){
		
		return productService.getAllProducts();
	}
	
	@GetMapping("/productDetails/{productId}/{category}")
	public ProductDetailsResponse getProductDeatails(@PathVariable("productId") Long productId, @PathVariable("category")  String category) {
		
		return productDetailsService.getProductDetailsById(productId, category);
	}
	
	

}
