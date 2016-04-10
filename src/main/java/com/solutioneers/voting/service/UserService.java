package com.solutioneers.voting.service;

import com.solutioneers.voting.dto.User;

public interface UserService {
	public User updateUser(User user);

	public User getUser(String email);

	public Iterable<User> getAllUsers();

}
