package com.rt.Repository;

import java.awt.print.Pageable;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.rt.entity.Product;

@Component
public interface ProductRepository extends JpaRepository<Product, Integer> {

	Product findById(int id);

	List<Product> findByIsDeletedFalse();

	 Page<Product> findByIsDeletedFalse(PageRequest pageable);

}
