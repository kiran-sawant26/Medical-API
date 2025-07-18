package com.rt.ServiceIMPL;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rt.DTO.RegReqDTO;
import com.rt.Mapper.RegisterMapper;
import com.rt.Repository.RegisterRepository;
import com.rt.Service.RegisterService;
import com.rt.entity.Register;

@Service
public class RegisterServiceImpl implements RegisterService {

	@Autowired
	private RegisterRepository registerRepo;

	@Autowired
	private RegisterMapper registerMapper;

	@Override
	public boolean addReg(RegReqDTO reqReqDTO) {

		Register entity = registerMapper.toEntity(reqReqDTO);

		Register isadded = registerRepo.save(entity);

		if (isadded != null) {
			return true;
		}
		return false;

	}

}
