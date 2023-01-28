package com.algoDomain.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.algoDomain.dao.ProductDao;
import com.algoDomain.model.Product;
import com.algoDomain.response.ProductDetailsResponse;
import com.algoDomain.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {
	
	@Autowired
	private ProductDao productDao;

	@Override
	public Product addProduct(Product product) {
		
		return productDao.save(product);
	}

	@Override
	public void removeProduct(Long id) {
		
		productDao.deleteById(id);
	}

	@Override
	public Product showProductById(Long id) {
		
		return productDao.findById(id).get();
	}

	@Override
	public List<Product> getAllProducts() {

		return productDao.findAll();
	}

	
}
