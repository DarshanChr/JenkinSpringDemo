package com.darshan.jenkinspringdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.darshan.jenkinspringdemo.model.Users;
import com.darshan.jenkinspringdemo.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	
	
	private final UserService userService;
	
	@Autowired
	public UserController(UserService userService) {
		this.userService=userService;
	}	

	@GetMapping("/getAllUser")
	public ResponseEntity<?> getAllUser(){
		List<Users> allUser = userService.getAllUser();
		return new ResponseEntity<>(allUser,HttpStatus.OK);
	}
}
