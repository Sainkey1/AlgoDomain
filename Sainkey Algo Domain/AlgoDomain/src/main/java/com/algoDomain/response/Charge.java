package com.algoDomain.response;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Charge {
	
	private BigDecimal gst;
	
	private BigDecimal delivery;

}
