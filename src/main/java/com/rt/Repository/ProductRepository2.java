package com.rt.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.rt.entity.Product;

@Component
public interface ProductRepository2 extends JpaRepository<Product, Integer> {
     
	Optional<Product> findById(int id);

}
