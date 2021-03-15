package com.example.springbootactuator;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.stereotype.Repository;

@Repository
public class UserRepository {

	public List<User> getUsersList() {

		return	Stream.of(
				new User(1, "Venkat","true"),
				new User(2, "ABCD","true"),
				new User(3, "ABCD","false"))
				.collect(Collectors.toList());
	}
	
	public List<User> getActiveUserList() {
		
		return	getUsersList().stream().filter(user -> user.getStatus().equals("true")).collect(Collectors.toList());	
	}
}
