package com.cartZone.cart.serviceImpl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.cartZone.cart.pojo.Registration;
import com.cartZone.cart.service.LoginServices;

/***
 * 
 * Service Layer for Adding Data
 */
@Component
public class LoginServicesImpl implements LoginServices {

	Map<String,Registration> registrationMap = null;
	
	public LoginServicesImpl() {
		registrationMap = new HashMap<>();
	}

	/***
	 * For Checking if user is valid or not
	 */
	@Override
	public boolean login(String username, String password) {
		Registration registerationObj = registrationMap.get(username);
		return registerationObj.getUsername().equals(username) && registerationObj.getPassword().equals(password);
	}

	/***
	 * Registering the user with details
	 * 
	 * Not registering, If username is present
	 */
	@Override
	public String register(Registration registration) {
		if(registrationMap.get(registration.getUsername()) != null)
			return "User Already Registered";
		
		registrationMap.put(registration.getUsername(),registration);
		return "Account Registered with Username :" + registration.getUsername();
	}

}
