package com.rt.Mapper;


import org.springframework.stereotype.Component;

import com.rt.DTO.SupplierReqDTO;
import com.rt.entity.Supplier;

@Component
public class SupplierMapper {
	
	
	public static Supplier toEntity(SupplierReqDTO dto) {
		
		Supplier supplier = new Supplier();
		supplier.setName(dto.getName());
		supplier.setContact(dto.getContact());
		supplier.setEmail(dto.getEmail());
		supplier.setAddress(dto.getAddress());
		
		return supplier;
		
	}

}
