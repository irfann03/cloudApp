package com.example.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.*;
import com.example.demo.Repository.*;

@Service
public class UserService {
	@Autowired
	private UserRepository userRepository;

	public Users signupCustomer(Users user) {
		Customer customer = user.getCustomer();
		if (customer != null)
			customer.setUser(user);
		return userRepository.save(user);
	}
	
	  public Users signupKitchen(Users user) {
	        Kitchen kitchen = user.getKitchen();

	        if (kitchen != null) {
	            kitchen.setUser(user); // Link BEFORE saving
	        }

	        return userRepository.save(user); // Cascades save to Kitchen
	    }
}
