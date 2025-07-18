package com.rt.Mapper;

import org.springframework.stereotype.Component;

import com.rt.DTO.UserRespDto;
import com.rt.entity.Register;

@Component
public class UserMapper {

	public UserRespDto toResponseDto(Register validuser) {
		
			return new UserRespDto(validuser.getName(),validuser.getUsername(),validuser.getRole());
		
	
	}
	
}
