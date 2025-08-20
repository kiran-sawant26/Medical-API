package com.rt.Mapper;

import org.springframework.stereotype.Component;

import com.rt.DTO.ProductReqDTO;
import com.rt.DTO.ProductResponseDto;
import com.rt.entity.Brand;
import com.rt.entity.Category;
import com.rt.entity.Product;

@Component
public class ProductMapper {

    // Convert DTO to Entity - without setting brand and category directly
    public Product toProduct(ProductReqDTO dto, Brand brand, Category category) {
        Product p = new Product();
        
        p.setName(dto.getName());
        p.setBrand(brand);  // Properly assign brand
        p.setCategory(category); // Properly assign category
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

    // Convert Entity to DTO for response
    public ProductResponseDto toResponseDto(Product p) {
        ProductResponseDto dto = new ProductResponseDto();
        dto.setId(p.getId());
        dto.setName(p.getName());

        // Always check for nulls to avoid exceptions
        dto.setBrand(p.getBrand() != null ? p.getBrand().getBrandName() : null);
        dto.setCategory(p.getCategory() != null ? p.getCategory().getName() : null);

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

    // Update existing product with new DTO + brand + category
    public void updateEntityFromDto(Product existingProduct, ProductReqDTO dto, Brand brand, Category category) {
        existingProduct.setName(dto.getName());
        existingProduct.setBrand(brand);
        existingProduct.setCategory(category);
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
