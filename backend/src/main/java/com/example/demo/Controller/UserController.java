package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.*;
import com.example.demo.Service.*;

@RestController
@RequestMapping("/user")
public class UserController {
	@Autowired
	UserService userService;
	
	@PostMapping("/customer")
	public ResponseEntity<Users> addCustomer(@RequestBody Users user){
		return ResponseEntity.ok(userService.signupCustomer(user));
	}

	@PostMapping("/kitchen")
	public ResponseEntity<Users> addKitchen(@RequestBody Users user){
		return ResponseEntity.ok(userService.signupKitchen(user));
	}
	
}
