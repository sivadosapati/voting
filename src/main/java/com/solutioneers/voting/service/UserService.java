package com.solutioneers.voting.service;

import com.solutioneers.voting.dto.User;

public interface UserService {
	public void updateUser(User user);

	public User getUser(String email);

	public User createUser(User user);

}
