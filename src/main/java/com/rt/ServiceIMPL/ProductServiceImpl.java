package com.rt.ServiceIMPL;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rt.DTO.ProductReqDTO;
import com.rt.DTO.ProductResponseDto;
import com.rt.Mapper.ProductMapper;
import com.rt.Repository.ProductRepository;
import com.rt.Repository.ProductRepository2;
import com.rt.Service.BrandService;
import com.rt.Service.CategoryService;
import com.rt.Service.ProductService;
import com.rt.entity.Brand;
import com.rt.entity.Category;
import com.rt.entity.Product;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductMapper mapper;

	@Autowired
	private BrandService brandService;
	@Autowired
	private ProductRepository2 productRepository2;

	@Autowired
	private CategoryService categoryService;
	@Autowired
	private ProductRepository productRepository;

	@Override
	public boolean addProduct(ProductReqDTO reqDTO) {

		Brand b = brandService.getBrandById(reqDTO.getBrand());
		Category c = categoryService.getCaetgoryById(reqDTO.getCategory());

		Product product = mapper.toProduct(reqDTO, b, c);

		Product savedProduct = productRepository.save(product);

		return savedProduct != null;
	}

	@Override
	public List<ProductResponseDto> getPaginatedProducts(int page, int size) {
	    PageRequest pageable = PageRequest.of(page, size);

	    // isDeleted = false condition सह pagination
	    Page<Product> pagedProducts = productRepository.findByIsDeletedFalse(pageable);

	    List<ProductResponseDto> dtoList = new ArrayList<>();

	    for (Product product : pagedProducts.getContent()) {
	        ProductResponseDto dto = mapper.toResponseDto(product);
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
	public Product updateProduct(ProductReqDTO reqDto) {

		Product existingProduct = productRepository.findById(reqDto.getId());
		if (existingProduct == null) {
			throw new RuntimeException("Product not found");
		}
		mapper.updateEntityFromDto(existingProduct, reqDto, null, null);
		Product result = productRepository.save(existingProduct);
		return result;

	}

	@Override
	public boolean deleteProduct(int id) {
		Optional<Product> optional = productRepository2.findById(id);

		if (optional.isPresent()) {
			Product entity = optional.get();
			entity.setDeleted(true);
			productRepository.save(entity);
			return true;

		} else {
			System.out.println("Id Not Found " + id);
			return false;
		}
	}

	

	

	

}
