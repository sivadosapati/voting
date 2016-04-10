package com.solutioneers.voting.dto;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Channel extends BaseObject {
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getVoteLimitPerUser() {
		return voteLimitPerUser;
	}

	public void setVoteLimitPerUser(Integer voteLimitPerUser) {
		this.voteLimitPerUser = voteLimitPerUser;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public List<Question> getQuestions() {
		return questions;
	}

	public void setQuestions(List<Question> questions) {
		this.questions = questions;
	}

	private String name;
	private String description;
	private Integer voteLimitPerUser;
	private String userId;
	private List<Question> questions = new ArrayList<Question>();
}
