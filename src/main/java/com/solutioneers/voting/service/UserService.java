package com.solutioneers.voting.service;

import java.util.List;

import com.solutioneers.voting.dto.User;

public interface UserService {
	public User updateUser(User user);

	public User getUser(String email);

	public List<User> getAllUsers();

}
