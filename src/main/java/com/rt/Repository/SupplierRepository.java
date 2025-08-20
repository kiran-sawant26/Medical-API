package com.rt.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;

import com.rt.entity.Supplier;


@Repository
public interface SupplierRepository extends JpaRepository<Supplier, Integer>{

	
	
}
