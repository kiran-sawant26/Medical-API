package com.rt.ServiceIMPL;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rt.DTO.UserReqDto;
import com.rt.DTO.UserRespDto;
import com.rt.Mapper.RegisterMapper;
import com.rt.Mapper.UserMapper;
import com.rt.Repository.UserRepository;
import com.rt.Service.UserService;
import com.rt.entity.Register;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserMapper userMapper;

	@Autowired
	private UserRepository userRepository;

	@Override
	public UserRespDto checkUser(UserReqDto userReqDto) {

		Register validuser = userRepository.findByUsernameAndPassword(userReqDto.getUsername(),
				userReqDto.getPassword());
		if (validuser !=  null) {
			return userMapper.toResponseDto(validuser);
		} else {
			return null;
		}
	}

}
