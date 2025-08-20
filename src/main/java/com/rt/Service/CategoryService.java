package com.rt.Service;

import java.util.List;

import com.rt.DTO.CategoryReqDTO;
import com.rt.DTO.CategoryResponseDTO;
import com.rt.entity.Category;

public interface CategoryService {

	boolean addCategory(CategoryReqDTO catReqDto);

	List<CategoryResponseDTO> getAllCategory();

	CategoryResponseDTO getCategoryById(int id);

	Category updateCategory(CategoryReqDTO dto);

	Category getCaetgoryByName(String category);

	Category getCaetgoryById(int category);

}
