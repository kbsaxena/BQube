package com.cartZone.cart.service;

import java.util.List;

import com.cartZone.cart.pojo.Registration;

public interface LoginServices {
	List<Registration> register(String name,String username, String password, String phone, String email);
    void login(String username, String password);
    List<Registration> setDummyData();
}
