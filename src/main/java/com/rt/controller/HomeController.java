package com.rt.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	@PostMapping("/hello")
	public String hello() {
	
		return "hello java";
	}

	
	
}
