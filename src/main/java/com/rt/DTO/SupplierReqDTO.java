package com.rt.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SupplierReqDTO {

	private int id;
	private String name;
	private String contact;
	private String email;
	private String address;
}
