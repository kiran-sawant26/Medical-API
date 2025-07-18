package com.rt.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.rt.entity.Register;

@Repository
public interface UserRepository extends JpaRepository<Register, Integer>{

	Register findByUsernameAndPassword(String username,String password);
}
