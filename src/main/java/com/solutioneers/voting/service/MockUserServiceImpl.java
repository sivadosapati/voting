package com.solutioneers.voting.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.solutioneers.voting.dto.User;
import com.solutioneers.voting.util.Util;

@Component
public class MockUserServiceImpl implements UserService {

	private Map<String, User> users = new HashMap<String, User>();

	@Override
	public User updateUser(User user) {
		String email = user.getEmail();
		User u = users.get(email);
		if (u == null) {
			u = createUser(user);
			users.put(u.getEmail(),u);
			return u;
		}
		users.put(email, user);
		return u;

	}

	@Override
	public User getUser(String email) {
		return users.get(email);
	}

	public User createUser(User user) {
		User u = new User();
		u.setEmail(user.getEmail());
		u.setName(user.getName());
		u.setId(Util.getId());
		return u;
	}

}
