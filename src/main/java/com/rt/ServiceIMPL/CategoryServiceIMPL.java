package com.rt.ServiceIMPL;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rt.DTO.CategoryReqDTO;
import com.rt.DTO.CategoryResponseDTO;
import com.rt.Mapper.CategoryMapper;
import com.rt.Repository.CategoryRepository;
import com.rt.Service.CategoryService;
import com.rt.entity.Category;

@Service
public class CategoryServiceIMPL implements CategoryService {

	@Autowired
	private CategoryMapper mapper;

	@Autowired
	private CategoryRepository repo;

	@Override
	public boolean addCategory(CategoryReqDTO catReqDto) {

	    Category category = mapper.toEntity(catReqDto);

	    Category addcategory = repo.save(category);

	    // Check if saved entity is not null instead of the original category
	    if (addcategory != null) {
	        return true;
	    } else {
	        return false;
	    }
	}


	@Override
	public List<CategoryResponseDTO> getAllCategory() {
		List<Category> list = repo.findAll();

		List<CategoryResponseDTO> dtoList = new ArrayList<>();

		for (Category category : list) {
			CategoryResponseDTO dto = mapper.toResponceDto(category);
			dtoList.add(dto);
		}

		return dtoList;
	}

	@Override
	public CategoryResponseDTO getCategoryById(int id) {

		Category dto = repo.findById(id);

		CategoryResponseDTO result = mapper.toResponseDto(dto);

		return result;
	}

	@Override
	public Category updateCategory(CategoryReqDTO dto) {

	    Category existingCategory = repo.findById(dto.getId());

	    existingCategory.setName(dto.getName());

	    Category result = repo.save(existingCategory);
	    return result;
	}

	@Override
	public Category getCaetgoryByName(String category) {
		return repo.findByName(category);
		
	}


	@Override
	public Category getCaetgoryById(int category) {
		return repo.findById(category);
	}


}
