package com.usermanagement.userManagementApp.actuatorEndpoint;

import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.boot.actuate.endpoint.annotation.DeleteOperation;
import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.boot.actuate.endpoint.annotation.Selector;
import org.springframework.boot.actuate.endpoint.annotation.WriteOperation;
import org.springframework.stereotype.Component;

@Component
@Endpoint(id = "userAppInfo")
public class UserAppInfoEdgePoint {

	@ReadOperation
	public UserAppInfo userAppInfo() {
		Map<String, Object> details = new LinkedHashMap<>();
		details.put("Application Location", "NOIDA");
		details.put("Status", "Ok");

		UserAppInfo userAppInfo = new UserAppInfo();
		userAppInfo.setHealthDetails(details);

		return userAppInfo;
	}

	@ReadOperation
	public String userAppEndpointByName(@Selector String name) {
		return "User mangement application working fine " + name;
	}

	@WriteOperation
	public void writeOperation(@Selector String name) {

	}

	@DeleteOperation
	public void deletOperation(@Selector String name) {

	}
}
