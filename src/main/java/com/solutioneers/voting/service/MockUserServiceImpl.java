package com.solutioneers.voting.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.solutioneers.voting.dto.User;

@Component(value = "mockUserServiceImpl")
public class MockUserServiceImpl extends AbstractUserServiceImpl implements
		UserService {

	private Map<String, User> users = new HashMap<String, User>();

	@Override
	public User updateUser(User user) {
		String email = user.getEmail();
		User u = users.get(email);
		if (u == null) {
			u = createUser(user);
			users.put(u.getEmail(), u);
			return u;
		}
		user.setId(u.getId());
		users.put(email, user);
		return user;

	}

	@Override
	public User getUser(String email) {
		return users.get(email);
	}

	@Override
	public Iterable<User> getAllUsers() {
		return new ArrayList<User>(users.values());
	}

}
