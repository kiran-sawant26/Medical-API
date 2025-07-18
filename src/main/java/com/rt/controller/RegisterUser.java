package com.rt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rt.DTO.RegReqDTO;
import com.rt.Service.RegisterService;

@RestController
@RequestMapping("/api")
public class RegisterUser {

	@Autowired
	private RegisterService registerservice;

	@PostMapping("/add")
	public boolean registerUser(@RequestBody RegReqDTO reqReqDTO) {
		System.out.println(reqReqDTO.getUsername()+" "+reqReqDTO.getPassword());
     return registerservice.addReg(reqReqDTO);
		

	}
}
