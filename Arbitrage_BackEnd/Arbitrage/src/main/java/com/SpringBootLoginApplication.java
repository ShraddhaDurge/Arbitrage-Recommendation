package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.controllers.SharesController;
import com.pojo.CustomerShares;
import com.pojo.Users;

@SpringBootApplication
public class SpringBootLoginApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootLoginApplication.class, args);
		
	}

}
