package com.rt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rt.DTO.UserReqDto;
import com.rt.DTO.UserRespDto;
import com.rt.Service.UserService;

@RestController
@RequestMapping("/api")
public class UserController {

	@Autowired
	private UserService userService;
	@PostMapping("/checklogin")
	public UserRespDto checkUser(@RequestBody UserReqDto userReqDto) {
		return userService.checkUser(userReqDto);
		
	}
}
