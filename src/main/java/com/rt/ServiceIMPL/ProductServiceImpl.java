package com.rt.ServiceIMPL;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rt.DTO.ProductReqDTO;
import com.rt.DTO.ProductResponseDto;
import com.rt.Mapper.ProductMapper;
import com.rt.Repository.ProductRepository;
import com.rt.Service.ProductService;
import com.rt.entity.Product;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductMapper mapper;

	@Autowired
	private ProductRepository productRepository;

	@Override
	public boolean addProduct(ProductReqDTO reqDTO) {
		Product product = mapper.toProduct(reqDTO);
		Product addProduct = productRepository.save(product);
		if (addProduct != null) {
			return true;
		}
		return false;
	}

	@Override
	public List<ProductResponseDto> getAllProducts() {

		List<Product> list = productRepository.findAll();

		List<ProductResponseDto> dtoList = new ArrayList<ProductResponseDto>();

		for (Product p : list) {

			ProductResponseDto dto = mapper.toResponseDto(p);
			dtoList.add(dto);

		}

		return dtoList;

	}

	@Override
	public ProductResponseDto getProductById(int id) {
		Product dto = productRepository.findById(id);

		ProductResponseDto result = mapper.toResponseDto(dto);
		return result;
	}
	

	@Override
	public Product updateProduct(ProductReqDTO reqDto ) {

		Product existingProduct = productRepository.findById(reqDto.getId());
		if (existingProduct == null) {
		    throw new RuntimeException("Product not found");
		}
		mapper.updateEntityFromDto(existingProduct, reqDto);
		Product result= productRepository.save(existingProduct);
		return result;  

	}
}
