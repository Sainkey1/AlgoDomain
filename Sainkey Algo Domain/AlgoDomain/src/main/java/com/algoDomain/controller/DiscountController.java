package com.algoDomain.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.algoDomain.dao.DiscountDao;
import com.algoDomain.model.Discount;
import com.algoDomain.model.Product;
import com.algoDomain.service.DiscountService;

@RestController
@RequestMapping("/dis")
public class DiscountController {
	
	@Autowired
	private DiscountService discountService;
	
	@PostMapping("/add")
	public Discount addProduct(@RequestBody Discount discount) {
		
		return discountService.addProduct(discount);
		
	}
	
	@DeleteMapping("/remove/{id}")
	public void deleteProduct(@RequestParam("id") Long id) {
		
		discountService.removeProduct(id);
		
	}
	
	@GetMapping("/discount/{productCategory}")
	public Discount showProductById(@PathVariable("productCategory") String productCategory) {
		
		return discountService.showDiscountById(productCategory);
	}
	
	@GetMapping("/discounts")
	public List<Discount> getAllDiscounts(){
		
		return discountService.getAllDiscounts();
	}
	
	

}
