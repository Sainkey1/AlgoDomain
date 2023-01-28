package com.algoDomain.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.algoDomain.model.Discount;

@Repository
public interface DiscountDao extends JpaRepository<Discount, Long> {
	
	@Query(value = "select u from Discount u where u.productCategory=:productCategory")
	Discount getDiscountByCategory(String productCategory);

}
