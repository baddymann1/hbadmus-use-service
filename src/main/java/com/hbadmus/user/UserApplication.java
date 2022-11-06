package com.hbadmus.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.hbadmus.common.ApplicationCommon;
import com.hbadmus.common.services.json.JsonConverter;

@SpringBootApplication(scanBasePackageClasses = {ApplicationCommon.class})
public class UserApplication {

	@Autowired
	private JsonConverter jsonConverter;

	public static void main(String[] args) {
		SpringApplication.run(UserApplication.class, args);
	}

}
