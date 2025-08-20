package com.rt.Mapper;

import java.util.Optional;

import org.springframework.stereotype.Component;

import com.rt.DTO.BrandReqDTO;
import com.rt.DTO.BrandRespDTO;
import com.rt.entity.Brand;

@Component
public class BrandMapper {

	public Brand toEntity(BrandReqDTO reqDto) {
	Brand b = new Brand();
	b.setId(reqDto.getId());
	b.setBrandName(reqDto.getBrandName());
		
		return b;
	}

	public BrandRespDTO toResponcDto(Brand brand) {
	BrandRespDTO reqDto = new BrandRespDTO();
	reqDto.setId(brand.getId());
	reqDto.setBrandName(brand.getBrandName());
		return reqDto;
	}

	public BrandRespDTO toResponceDto(Brand b) {
	
		BrandRespDTO dto = new BrandRespDTO();
		dto.setId(b.getId());
		dto.setBrandName(b.getBrandName());
		return dto;
	}

	
}
