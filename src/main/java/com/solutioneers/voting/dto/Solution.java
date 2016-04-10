package com.solutioneers.voting.dto;

import java.util.LinkedHashMap;
import java.util.Map;

public class Solution {
	private String content;
	private String userId;
	private Map<String, Integer> votesPerUser = new LinkedHashMap<String, Integer>();

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public Map<String, Integer> getVotesPerUser() {
		return votesPerUser;
	}

	public void setVotesPerUser(Map<String, Integer> votesPerUser) {
		this.votesPerUser = votesPerUser;
	}

}
