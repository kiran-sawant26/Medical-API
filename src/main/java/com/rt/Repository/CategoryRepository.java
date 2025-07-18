package com.rt.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.rt.entity.Category;

@Component
public interface CategoryRepository extends JpaRepository<Category, Integer> {

}
