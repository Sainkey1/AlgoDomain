package com.algoDomain.service;

import com.algoDomain.response.ProductDetailsResponse;

public interface ProductDetailsService {
	
	public  ProductDetailsResponse getProductDetailsById(Long productId, String category);

}
