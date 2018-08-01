package com.cartZone.cart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.cartZone.cart.service.LoginServices;
import com.cartZone.cart.serviceImpl.LoginServicesImpl;

@SpringBootApplication
public class DemoApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	
	@Bean
	public LoginServices getService() {
		return new LoginServicesImpl();
	}
}
