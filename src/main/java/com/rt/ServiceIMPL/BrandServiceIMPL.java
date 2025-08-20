package com.rt.ServiceIMPL;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.hibernate.engine.spi.Resolution;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rt.DTO.BrandReqDTO;
import com.rt.DTO.BrandRespDTO;
import com.rt.DTO.CategoryResponseDTO;
import com.rt.Mapper.BrandMapper;
import com.rt.Repository.BrandRepository;
import com.rt.Service.BrandService;
import com.rt.entity.Brand;
import com.rt.entity.Category;

@Service
public class BrandServiceIMPL implements BrandService{

	@Autowired
	private BrandMapper mapper;
	
	@Autowired 
	private BrandRepository repository;
	
	@Override
	public boolean saveBrand(BrandReqDTO reqDto) {
         Brand brand = mapper.toEntity(reqDto);
      Brand addBrand =   repository.save(brand);
      if(addBrand != null) {
    	  return true;  
      }else {
    	  return false;
      }
		
	}

	@Override
	public List<BrandRespDTO> getAllBrand() {
	
		List<Brand> list = repository.findAll();
		List<BrandRespDTO> dtoList = new ArrayList<BrandRespDTO>();
		
		for(Brand brand : list) {
			BrandRespDTO dto = mapper.toResponcDto(brand);
			dtoList.add(dto);
		}
		return dtoList;
		
	}
	@Override
	public BrandRespDTO editbrandById(int id) {

	    Brand brand = repository.findById(id);

	    BrandRespDTO responce = mapper.toResponceDto(brand);

	    return responce;
	}

	@Override
	public Brand UpdateBrand(BrandReqDTO reqDto) {
		
	    Brand brand = repository.findById(reqDto.getId());

	    if (brand == null) {
	        throw new RuntimeException("Brand सापडला नाही (ID: " + reqDto.getId() + ")");
	    }

	    brand.setBrandName(reqDto.getBrandName());
	    return repository.save(brand);
	}

	@Override
	public Brand getBrandByName(String brand) {
	
		return repository.findByBrandName(brand);
	}

	@Override
	public Brand getBrandById(int brand) {
		return repository.findById(brand);
	}	


	

}
