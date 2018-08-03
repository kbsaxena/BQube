package com.cartZone.cart.service;

import com.cartZone.cart.pojo.Registration;

public interface LoginServices {
	String register(Registration registerationObj);
    boolean login(String username, String password);
}
