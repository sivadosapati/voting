package com.solutioneers.voting.dto;

import org.springframework.data.annotation.Id;

import com.solutioneers.voting.util.Util;

public abstract class BaseObject {

	@Id
	private String id;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String toString() {
		return Util.toString(this);
	}
}
