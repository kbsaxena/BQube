package com.cartZone.cart;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cartZone.cart.pojo.Registration;
import com.cartZone.cart.service.LoginServices;

@Controller
public class LoginController{
	
	@Autowired
	LoginServices loginService;
	
	/***
	 * 
	 * @param registerationObj
	 * @return username
	 * 
	 * API for Registering the User
	 */
	@PostMapping("/register")
    @ResponseBody
    public String registerUser(@RequestBody Registration registerationObj) {
		return loginService.register(registerationObj);
    }
	
	
	/***
	 * 
	 * @param userCreds
	 * @return isRegistered or not
	 * 
	 * Verifying the user Credentials
	 */
	@PostMapping("/login")
    @ResponseBody
    public boolean verifyUser(@RequestBody Map<String, String> userCreds) {
		return loginService.login(userCreds.get("username"), userCreds.get("password"));
    }
	
}
