package com.darshan.jenkinspringdemo.service.impl;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.darshan.jenkinspringdemo.model.Users;
import com.darshan.jenkinspringdemo.service.UserService;

@Service
public class UserServiceImpl implements UserService{

	@Override
	public List<Users> getAllUser() {
		
		Users u=new Users("sachin", "Mumbai");
		Users u1=new Users("rahul", "Bangalore");
		Users u2=new Users("yuvi", "Punjab");
		List<Users> userList=Arrays.asList(u,u1,u2);
		return userList;
	}

}
