package com.rt.Service;

import org.springframework.http.ResponseEntity;

import com.rt.DTO.SupplierReqDTO;

public interface SupplierService {

	ResponseEntity addSupplier(SupplierReqDTO dto);
	
	

}
