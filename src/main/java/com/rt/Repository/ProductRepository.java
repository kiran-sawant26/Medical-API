package com.rt.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.rt.entity.Product;

@Component
public interface ProductRepository extends JpaRepository<Product, Integer> {
     
	Product findById(int id);
	
}
