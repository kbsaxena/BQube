package com.cartZone.cart;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cartZone.cart.pojo.Registration;
import com.cartZone.cart.service.LoginServices;

@Controller
public class LoginController {

	@Autowired
	private LoginServices loginService;
	
	@GetMapping("/getData/{id}")
    @ResponseBody
    public Registration getUserDetails(@RequestParam(name="id", required=true) int id) {
		List<Registration> regList =  loginService.setDummyData();
		
		Registration registrationObj = regList.get(0);
		
		return registrationObj;
    }
	
	//Under Process
	/*@PostMapping("/register")
    @ResponseBody
    public String getUserDetails(@RequestBody) {
        return "Kulbhushan Saxena";
    }*/
}
