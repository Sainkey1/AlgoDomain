package com.algoDomain.service;

import java.util.List;

import com.algoDomain.model.Product;
import com.algoDomain.response.ProductDetailsResponse;

public interface ProductService {
	
	public Product addProduct(Product product);
	
	public void removeProduct(Long id);
	
	public Product showProductById(Long id);
	
	public List<Product> getAllProducts();
	

}
