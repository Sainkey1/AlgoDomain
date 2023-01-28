package com.algoDomain.service;

import java.util.List;

import com.algoDomain.model.Discount;

public interface DiscountService {
	
	public Discount addProduct(Discount discount);
	
	public void removeProduct(Long id);
	
	public Discount showDiscountById(String category);
	
	public List<Discount> getAllDiscounts();

}
