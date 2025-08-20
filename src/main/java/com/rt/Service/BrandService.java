package com.rt.Service;

import java.util.List;

import com.rt.DTO.BrandReqDTO;
import com.rt.DTO.BrandRespDTO;
import com.rt.entity.Brand;

public interface BrandService {

	boolean saveBrand(BrandReqDTO reqDto);

	
	List<BrandRespDTO> getAllBrand();


	BrandRespDTO editbrandById(int id);


	Brand UpdateBrand(BrandReqDTO reqDto);


	Brand getBrandByName(String brand);


	Brand getBrandById(int brand);
	
	

}
