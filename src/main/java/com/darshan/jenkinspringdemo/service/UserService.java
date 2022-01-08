package com.darshan.jenkinspringdemo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.darshan.jenkinspringdemo.model.Users;


public interface UserService {

	List<Users> getAllUser();
}
