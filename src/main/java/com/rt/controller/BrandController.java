package com.rt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rt.DTO.BrandReqDTO;
import com.rt.DTO.BrandRespDTO;
import com.rt.Service.BrandService;
import com.rt.entity.Brand;

@RestController
@RequestMapping("/api")
public class BrandController {
	@Autowired
	private BrandService brandService;

	@PostMapping("/saveBrand")
	public boolean saveBrand(@RequestBody BrandReqDTO reqDto) {
		boolean isadded = brandService.saveBrand(reqDto);
		return isadded;

	}

	@GetMapping("/Allbrand")
	public List<BrandRespDTO> getAllBrand() {
		return brandService.getAllBrand();
	}

	@GetMapping("/editBrand/{id}")
	public BrandRespDTO editBrand(@PathVariable int id) {
		return brandService.editbrandById(id);

	}
	
	@PutMapping("/updateBrand")
	public Brand UdpateBrand(@ModelAttribute BrandReqDTO reqDto) {
		return brandService.UpdateBrand(reqDto);
	}
}
