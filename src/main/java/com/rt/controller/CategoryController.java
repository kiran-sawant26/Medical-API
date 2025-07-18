package com.rt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rt.DTO.CategoryReqDTO;
import com.rt.Service.CategoryService;

@RestController
@RequestMapping("/api")



public class CategoryController {
	
	@Autowired
	private CategoryService categoryService;
	
	@PostMapping("/categories")
	public boolean addCategory(@RequestBody CategoryReqDTO catReqDto) {
		boolean isadded = categoryService.addCategory(catReqDto);
		return isadded;
	}

}
