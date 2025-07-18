package com.rt.Mapper;

import java.util.Optional;

import org.springframework.stereotype.Component;

import com.rt.DTO.ProductReqDTO;
import com.rt.DTO.ProductResponseDto;
import com.rt.entity.Product;

@Component
public class ProductMapper {

	public Product toProduct(ProductReqDTO dto) {
		Product p = new Product();
		p.setName(dto.getName());
		p.setBrand(dto.getBrand());
		p.setCategory(dto.getCategory());
		p.setBatchNo(dto.getBatchNo());
		p.setMfgDate(dto.getMfgDate());
		p.setExpDate(dto.getExpDate());
		p.setPurchaseRate(dto.getPurchaseRate());
		p.setSellingRate(dto.getSellingRate());
		p.setQuantity(dto.getQuantity());
		p.setGst(dto.getGst());
		p.setRackNo(dto.getRackNo());

		return p;
	}

	public ProductResponseDto toResponseDto(Product p) {
		ProductResponseDto dto = new ProductResponseDto();
		dto.setId(p.getId());
		dto.setName(p.getName());
		dto.setBrand(p.getBrand());
		dto.setCategory(p.getCategory());
		dto.setBatchNo(p.getBatchNo());
		dto.setMfgDate(p.getMfgDate());
		dto.setExpDate(p.getExpDate());
		dto.setPurchaseRate(p.getPurchaseRate());
		dto.setSellingRate(p.getSellingRate());
		dto.setQuantity(p.getQuantity());
		dto.setGst(p.getGst());
		dto.setRackNo(p.getRackNo());

		return dto;
	}

	public Product toEntity(ProductReqDTO dto) {
		Product p = new Product();
		p.setName(dto.getName());
		p.setBrand(dto.getBrand());
		p.setCategory(dto.getCategory());
		p.setBatchNo(dto.getBatchNo());
		p.setMfgDate(dto.getMfgDate());
		p.setExpDate(dto.getExpDate());
		p.setPurchaseRate(dto.getPurchaseRate());
		p.setSellingRate(dto.getSellingRate());
		p.setQuantity(dto.getQuantity());
		p.setGst(dto.getGst());
		p.setRackNo(dto.getRackNo());

		return p;

	}

	public void updateEntityFromDto(Product existingProduct, ProductReqDTO dto) {
		existingProduct.setName(dto.getName());
		existingProduct.setBrand(dto.getBrand());
		existingProduct.setCategory(dto.getCategory());
		existingProduct.setBatchNo(dto.getBatchNo());
		existingProduct.setMfgDate(dto.getMfgDate());
		existingProduct.setExpDate(dto.getExpDate());
		existingProduct.setPurchaseRate(dto.getPurchaseRate());
		existingProduct.setSellingRate(dto.getSellingRate());
		existingProduct.setQuantity(dto.getQuantity());
		existingProduct.setGst(dto.getGst());
		existingProduct.setRackNo(dto.getRackNo());
	}

}
