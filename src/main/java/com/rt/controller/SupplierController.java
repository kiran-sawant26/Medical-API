package com.rt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rt.DTO.SupplierReqDTO;
import com.rt.Service.SupplierService;

@RestController
@RequestMapping("/api")
public class SupplierController {
	
	@Autowired
	private SupplierService supplierService;
	
	
	@PostMapping("/addSupplier")
	public ResponseEntity addSupplier(@RequestBody SupplierReqDTO dto) {
		
		 supplierService.addSupplier(dto);
		 return ResponseEntity.ok("Supplier added successfully!");
		
	}

}
