package com.cartZone.cart.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import com.cartZone.cart.pojo.Registration;
import com.cartZone.cart.service.LoginServices;

public class LoginServicesImpl implements LoginServices {

	List<Registration> registrationList = new ArrayList<>();
	
	//Under process
	@Override
	public void login(String username, String password) {
		

	}

	@Override
	public List<Registration> register(String name, String username, String password, String phone, String email) {
		Registration registration = new Registration();
		registration.setId(1);
		registration.setName(name);
		registration.setEmail(email);
		registration.setUsername(username);
		registration.setPassword(password);
		
		registrationList.add(registration);
		
		return registrationList;
	}
	
	@Override
	public List<Registration> setDummyData() {
		return register("Kulbhushan", "KB", "Dummy", "9085673459", "demo.spring@learn.com");
	}

	public List<Registration> getRegistrationList() {
		return registrationList;
	}

	public void setRegistrationList(List<Registration> registrationList) {
		this.registrationList = registrationList;
	}

}
