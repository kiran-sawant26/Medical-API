package com.rt.Mapper;

import org.hibernate.annotations.Comment;
import org.springframework.stereotype.Component;

import com.rt.DTO.RegReqDTO;
import com.rt.DTO.UserRespDto;
import com.rt.entity.Register;

@Component
public class RegisterMapper {

	    public Register toEntity(RegReqDTO reqReqDTO) {

		Register entity = new Register();
		entity.setName(reqReqDTO.getName());
		entity.setUsername(reqReqDTO.getUsername());
		entity.setPassword(reqReqDTO.getPassword());
		entity.setRole(reqReqDTO.getRole());
		return entity;

	}

}
