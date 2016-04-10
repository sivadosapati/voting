package com.solutioneers.voting.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.solutioneers.voting.dto.APIResponse;
import com.solutioneers.voting.dto.User;
import com.solutioneers.voting.service.UserService;
import com.solutioneers.voting.util.Util;

@RestController
@RequestMapping("/api/user")
public class UserController {

	@Autowired
	@Qualifier("mockUserServiceImpl")
	private UserService userService;

	@RequestMapping(value = "/{email}", method = RequestMethod.GET)
	public APIResponse getUser(@PathVariable("email") String email) {
		APIResponse ar = new APIResponse();
		User u = userService.getUser(email);
		ar.setResponse(u);
		return ar.computeTime();
	}

	@RequestMapping(method = RequestMethod.GET)
	public APIResponse getUser() {
		APIResponse ar = new APIResponse();
		List<User> users = userService.getAllUsers();
		ar.setResponse(users);
		return ar.computeTime();

	}

	@RequestMapping(method = RequestMethod.POST)
	public @ResponseBody APIResponse updateUser(@RequestBody User user) {
		APIResponse ar = new APIResponse();
		User u = userService.updateUser(user);
		ar.setResponse(u);
		return ar.computeTime();
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
