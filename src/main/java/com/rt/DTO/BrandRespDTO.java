package com.rt.DTO;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BrandRespDTO {
	
	@JsonProperty("id")
	private int id;
	private String brandName;
	
	
}
