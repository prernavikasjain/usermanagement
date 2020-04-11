package com.usermanagement.userManagementApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication //combination on @SpringBoot Configuration + @Componentscan +@EnableAutoConfiguration
public class UserManagementAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserManagementAppApplication.class, args);
	}

}
