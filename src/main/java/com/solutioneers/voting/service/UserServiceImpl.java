package com.solutioneers.voting.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.solutioneers.voting.dto.User;
import com.solutioneers.voting.repository.UserRepository;

@Component(value = "userServiceImpl")
public class UserServiceImpl extends AbstractUserServiceImpl implements
		UserService {

	@Autowired
	private UserRepository ur;

	public UserRepository getUserRepository() {
		return ur;
	}

	@Override
	public User updateUser(User user) {
		User u = getUserRepository().findByEmail(user.getEmail());
		if (u == null) {
			u = createUser(user);
			return ur.save(u);
		} else {
			user.setId(u.getId());
			return getUserRepository().save(user);
		}
	}

	@Override
	public User getUser(String email) {
		return getUserRepository().findByEmail(email);
	}

	@Override
	public Iterable<User> getAllUsers() {
		return getUserRepository().findAll();
	}

}
