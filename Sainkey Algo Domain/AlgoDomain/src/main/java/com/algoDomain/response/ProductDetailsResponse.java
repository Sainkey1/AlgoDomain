package com.algoDomain.response;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductDetailsResponse {
	
	private Long productId;
	
	private String name;
	
	private String productType;
	
	private String category;
	
	private BigDecimal basePrice;
	
	private BigDecimal discount;
	
	private Charge charge;
	
	private BigDecimal finalPrice;

}
