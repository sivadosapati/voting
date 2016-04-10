package com.solutioneers.voting.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VotingController {

	@RequestMapping("/test")
	public String test() {
		return "God is Great";
	}
}
