package com.algoDomain.serviceImpl;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.algoDomain.model.Discount;
import com.algoDomain.model.Product;
import com.algoDomain.response.Charge;
import com.algoDomain.response.ProductDetailsResponse;
import com.algoDomain.service.DiscountService;
import com.algoDomain.service.ProductDetailsService;
import com.algoDomain.service.ProductService;

@Service
public class ProductDetailsServiceImpl implements ProductDetailsService {
	
	@Autowired
	private ProductService productService;
	
	@Autowired
	private DiscountService discountService;

	@Override
	public ProductDetailsResponse getProductDetailsById(Long productId, String category) {
		
		ProductDetailsResponse productDetailsResponse = new ProductDetailsResponse(); 
		
	
			
			Product product = productService.showProductById(productId);
			BigDecimal productPrice = product.getProductPrice();
			
			
			Discount discount = discountService.showDiscountById(category);
			BigDecimal discountPercentage = new BigDecimal(discount.getDiscountPercentage()); 
			BigDecimal gstPercentage = new BigDecimal(discount.getGstPercantage());
			BigDecimal deliveryCharge = discount.getDeliveryCharge();
			
			
			
			Charge charge = new Charge();
			
			BigDecimal dicountOnProduct = ((productPrice.multiply(discountPercentage)).divide(new BigDecimal(100))); 
			
			BigDecimal gst = (productPrice.multiply(gstPercentage)).divide(new BigDecimal(100));
			
			BigDecimal finalPrice = (((productPrice.add(gst)).add(deliveryCharge)).subtract(discountPercentage));
			
			charge.setGst(gst);
			charge.setDelivery(deliveryCharge);
			
			productDetailsResponse.setProductId(productId);
			productDetailsResponse.setName(product.getProductName());
			productDetailsResponse.setProductType(product.getProductType());
			productDetailsResponse.setCategory(category);
			productDetailsResponse.setBasePrice(productPrice);
			productDetailsResponse.setDiscount(dicountOnProduct);
			productDetailsResponse.setCharge(charge);
			productDetailsResponse.setFinalPrice(finalPrice);
			
		
		
		return productDetailsResponse;
	}

}
