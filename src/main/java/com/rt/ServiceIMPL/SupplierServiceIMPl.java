package com.rt.ServiceIMPL;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.rt.DTO.SupplierReqDTO;
import com.rt.Mapper.SupplierMapper;
import com.rt.Repository.SupplierRepository;
import com.rt.Service.SupplierService;

import com.rt.entity.Supplier;

@Service
public class SupplierServiceIMPl implements SupplierService {

    @Autowired
    private SupplierRepository supplierRepository;
    
    @Autowired
    private SupplierMapper mapper;

    @Override
    public ResponseEntity addSupplier(SupplierReqDTO dto) {
    	
        Supplier supplier = mapper.toEntity(dto);
        supplierRepository.save(supplier); 
        return ResponseEntity.ok("✅ Supplier saved successfully!");
    }


}
