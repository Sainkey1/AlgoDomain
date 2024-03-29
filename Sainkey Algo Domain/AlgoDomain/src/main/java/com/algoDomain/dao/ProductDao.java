package com.algoDomain.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.algoDomain.model.Product;

@Repository
public interface ProductDao extends JpaRepository<Product, Long> {
	
	

}
