package com.solutioneers.voting.service;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import org.springframework.stereotype.Component;

import com.solutioneers.voting.dto.User;
import com.solutioneers.voting.util.Util;

@Component
public class MockUserServiceImpl implements UserService {

	private Map<String, User> users = new HashMap<String, User>();

	@Override
	public void updateUser(User user) {
		users.put(user.getEmail(), user);
	}

	@Override
	public User getUser(String email) {
		return users.get(email);
	}

	@Override
	public User createUser(User user) {
		User u = new User();
		u.setEmail(user.getEmail());
		u.setName(user.getName());
		u.setId(Util.getId());
		return u;
	}

}
