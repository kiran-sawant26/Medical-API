package com.rt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.rt")
public class MedicalApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(MedicalApiApplication.class, args);
	}
	

}
