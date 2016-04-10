package com.solutioneers.voting.service;

import com.solutioneers.voting.dto.User;
import com.solutioneers.voting.util.Util;

public class AbstractUserServiceImpl {
	public User createUser(User user) {
		User u = new User();
		u.setEmail(user.getEmail());
		u.setName(user.getName());
		u.setId(Util.getId());
		return u;
	}

}
