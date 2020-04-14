package com.usermanagement.userManagementApp.actuatorEndpoint;

import java.util.Map;

public class UserAppInfo {

	private Map<String, Object> healthDetails;

	public Map<String, Object> getHealthDetails() {
		return healthDetails;
	}

	public void setHealthDetails(Map<String, Object> healthDetails) {
		this.healthDetails = healthDetails;
	}

}
