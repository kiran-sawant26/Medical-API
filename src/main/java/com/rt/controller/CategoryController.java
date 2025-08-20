package com.rt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.rt.DTO.CategoryReqDTO;
import com.rt.DTO.CategoryResponseDTO;
import com.rt.Service.CategoryService;
import com.rt.entity.Category;

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

	@GetMapping("/allcategories")
	public List<CategoryResponseDTO> getAllCategory() {

		return categoryService.getAllCategory();

	}

	@GetMapping("/editCategory/{id}")
	public CategoryResponseDTO getCategoryById(@PathVariable int id) {

		CategoryResponseDTO result = categoryService.getCategoryById(id);
		return result;
	}

	@PutMapping("/category/update")
	public Category updateCategory(@RequestBody CategoryReqDTO dto) {
		return categoryService.updateCategory(dto);

	}
}
