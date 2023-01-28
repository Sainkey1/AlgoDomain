package com.algoDomain.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.algoDomain.dao.DiscountDao;
import com.algoDomain.model.Discount;
import com.algoDomain.service.DiscountService;

@Service
public class DiscountServiceImpl implements DiscountService {
	
	@Autowired
	private DiscountDao discountDao;

	@Override
	public Discount addProduct(Discount discount) {
		
		return discountDao.save(discount);
	}

	@Override
	public void removeProduct(Long id) {
	
		discountDao.deleteById(id);

	}

	@Override
	public Discount showDiscountById(String category) {
		
		return discountDao.getDiscountByCategory(category);
	}

	@Override
	public List<Discount> getAllDiscounts() {
		
		return discountDao.findAll();
	}

}
