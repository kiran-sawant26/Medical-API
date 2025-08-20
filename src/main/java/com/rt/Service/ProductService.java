package com.rt.Service;

import java.util.List;

import com.rt.DTO.ProductReqDTO;
import com.rt.DTO.ProductResponseDto;
import com.rt.entity.Product;

public interface ProductService {

	 boolean addProduct(ProductReqDTO reqDTO);

	    List<ProductResponseDto> getPaginatedProducts(int page, int size);

	    ProductResponseDto getProductById(int id);

	    Product updateProduct(ProductReqDTO reqDto);

	    boolean deleteProduct(int id);
}
