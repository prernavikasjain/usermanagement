package com.usermanagement.userManagementApp.actuatorEndpoint;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;

public class UserAppHealthIndicator implements HealthIndicator {

	@Override
	public Health health() {
		
		return Health.up().build();
	}

}
