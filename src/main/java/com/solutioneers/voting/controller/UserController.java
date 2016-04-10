package com.solutioneers.voting.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.solutioneers.voting.dto.User;
import com.solutioneers.voting.util.Util;

@RestController
@RequestMapping("/api/user")
public class UserController {

	@RequestMapping(value = "/{email}", method = RequestMethod.GET)
	public List<User> getUsers(@PathVariable("email") String email) {
		List<User> users = new ArrayList<User>();
		if (email == null || email.equals("")) {
			users.add(createRandomUser());
			users.add(createRandomUser());
		} else {
			User u = createRandomUser();
			u.setEmail(email);
			users.add(u);
		}
		return users;
	}

	@RequestMapping(method = RequestMethod.POST)
	public @ResponseBody User addUser(@RequestBody User user) {
		System.out.println("Reached addUser.." + user);
		// User u = createRandomUser();
		// u.setName("Alex -> " + Util.getRandomNumber(1000));
		user.setName(user.getName() + " -> Alex");
		return user;
	}

	private User createRandomUser() {
		User u = new User();
		int x = Util.getRandomNumber(1000);
		u.setName("Cva" + x);
		u.setEmail("cva.cva." + x + ".@gmail.com");
		int y = Util.getRandomNumber(10);
		for (int i = 0; i < y; i++) {
			u.addChannelId(Util.getRandomNumber(100) + "");
		}
		for (String channelId : u.getChannelIds()) {
			u.putVotes(channelId, Util.getRandomNumber(10));
		}
		return u;
	}
}
