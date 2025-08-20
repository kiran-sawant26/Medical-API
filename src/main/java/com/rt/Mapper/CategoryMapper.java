package com.rt.Mapper;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import com.rt.DTO.CategoryReqDTO;
import com.rt.DTO.CategoryResponseDTO;
import com.rt.entity.Category;

@Component
public class CategoryMapper {

	public Category toEntity(CategoryReqDTO catReqDto) {
		Category category = new Category();
		category.setName(catReqDto.getName());
		return category;
		
	}

	public CategoryResponseDTO toResponceDto(Category category) {
		CategoryResponseDTO dto = new CategoryResponseDTO();
		
		dto.setId(category.getId());
		dto.setName(category.getName());
		return dto;
	}

	public CategoryResponseDTO toResponseDto(Category category) {
		CategoryResponseDTO dto = new CategoryResponseDTO();
		dto.setId(category.getId());
		dto.setName(category.getName());
		
		return dto;
	}

	  public Category toEntity1(CategoryReqDTO dto) {
	        Category category = new Category();
	        category.setName(dto.getName());  
	
	        return category;
	    }
	
}
