package com.example;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan("com.example.mapper")
@SpringBootApplication
public class SpringBoot7Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBoot7Application.class, args);
		
	}

}
