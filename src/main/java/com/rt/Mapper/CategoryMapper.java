package com.rt.Mapper;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import com.rt.DTO.CategoryReqDTO;
import com.rt.entity.Category;

@Component
public class CategoryMapper {

	public Category toEntity(CategoryReqDTO catReqDto) {
		Category category = new Category();
		category.setName(catReqDto.getName());
		return category;
		
	}

}
