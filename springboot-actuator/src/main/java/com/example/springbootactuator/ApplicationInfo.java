package com.example.springbootactuator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.info.Info.Builder;
import org.springframework.boot.actuate.info.InfoContributor;
import org.springframework.stereotype.Component;

/**
 * This class for to get the dynamic application information from database
 * utility classes
 * 
 * @author Lenovo
 *
 */
@Component
public class ApplicationInfo implements InfoContributor {

	@Autowired
	private UserRepository UserRepository;

	@Override
	public void contribute(Builder builder) {

		builder.withDetail("Active user info", UserRepository.getActiveUserList());

	}

}
