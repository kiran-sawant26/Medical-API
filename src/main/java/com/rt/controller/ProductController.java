package com.rt.controller;

import java.util.List;

import javax.sound.sampled.ReverbType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.rt.DTO.ProductReqDTO;
import com.rt.DTO.ProductResponseDto;
import com.rt.Service.ProductService;
import com.rt.entity.Product;

@RestController
@RequestMapping("/api")
public class ProductController {

	@Autowired
	private ProductService productService;

	@PostMapping("/addProduct")
	public boolean addProduct(@RequestBody ProductReqDTO reqDTO) {
		boolean isAdded = productService.addProduct(reqDTO);
		return isAdded;

	}

	@GetMapping("/allProducts")
	public List<ProductResponseDto> getProducts(
	        @RequestParam(defaultValue = "0") int page,
	        @RequestParam(defaultValue = "10") int size) {
	    return productService.getPaginatedProducts(page, size);
	}

	@GetMapping("/getData/{id}")
	public ProductResponseDto getProductById(@PathVariable int id) {

		ProductResponseDto result = productService.getProductById(id);
		return result;
	}

	@PutMapping("/updateProduct")
	public Product updateProduct(@RequestBody ProductReqDTO reqDto) {

		return productService.updateProduct(reqDto);

	}
	
	
	
	@DeleteMapping("/deleteProduct/{id}")
	public ResponseEntity<?> deleteProduct(@PathVariable int id) {
		
		boolean isDeleted= productService.deleteProduct(id);
		if(isDeleted==true){
		return	ResponseEntity.ok(isDeleted);
			
		}
		else {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Not Deleted");
		}
				
			
		}
	}


