package com.rt.ServiceIMPL;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rt.DTO.CategoryReqDTO;
import com.rt.Mapper.CategoryMapper;
import com.rt.Repository.CategoryRepository;
import com.rt.Service.CategoryService;
import com.rt.entity.Category;

@Service
public class CategoryServiceIMPL implements CategoryService{
	
	@Autowired
	private CategoryMapper mapper;
	
	@Autowired
	private CategoryRepository repo;

	@Override
	public boolean addCategory(CategoryReqDTO catReqDto) {
	        
	Category category =  mapper.toEntity(catReqDto);
	
	Category addcategory = repo.save(category);
		
	if(category != null) {
		return true;
	}else {
		return false;
	}
	}

}
