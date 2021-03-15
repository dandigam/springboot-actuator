package com.example.springbootactuator;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.web.bind.annotation.RestController
public class RestController {
	
	@Autowired
	private UserRepository userRepository;
	
	@GetMapping("/getMsg")
	public String getMsg(){
		return "Welcome to spring boot Actuaor";
	}
	
	@GetMapping("/getUserList")
    public List<User> getUserList() {
    	
    	return userRepository.getUsersList();
    }
	
	@GetMapping("/activeStatus")
	public List<User> getUserActiveStatus() {
		return userRepository.getActiveUserList();
	}
	
}
