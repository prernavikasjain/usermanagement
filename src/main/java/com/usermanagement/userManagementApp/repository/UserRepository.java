package com.usermanagement.userManagementApp.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.usermanagement.userManagementApp.dto.User;

@Repository
public class UserRepository {

	List<User> listOfUsers = new ArrayList<>();

	public List<User> getAllUsers() {
		return listOfUsers;
	}

	public User getUser(String id) {
		for (User user : listOfUsers) {
			if (id.equals(user.getId())) {
				return user;
			}
		}
		return new User();
	}

	public void addUser(User user) {
		listOfUsers.add(user);
	}

	public User updateUser(User user) {
		for (User us : listOfUsers) {
			if (user.getId() == us.getId()) {
				us.setId(user.getId());
				us.setName(user.getName());
				us.setAddress(user.getAddress());
				return us;
			}
		}
		return new User();
	}

	public User deleteUser(String id) {
		for (User user : listOfUsers) {
			if (id.equals(user.getId())) {
				listOfUsers.remove(user);
				return user;
			}
		}
		return new User();
	}

}
