package com.rt.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rt.entity.Brand;
import com.rt.entity.Category;

@Repository
public interface BrandRepository extends JpaRepository<Brand, Integer>{

	Brand findById(int id);

	Brand findByBrandName(String brand);
}
