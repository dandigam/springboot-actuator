package com.example.springbootactuator;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.stereotype.Component;

/**
 * To create the custom endpoints
 * 
 * @author Lenovo
 *
 */
@Component
@Endpoint(id = "acutator-custom-endpoint")
public class CustomEndPoint {

	@Autowired
	private UserRepository rep;

	@ReadOperation
	public List<User> getList() {
		return rep.getActiveUserList();
	}
}
