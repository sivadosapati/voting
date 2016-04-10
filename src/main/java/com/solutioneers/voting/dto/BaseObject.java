package com.solutioneers.voting.dto;

import com.solutioneers.voting.util.Util;

public class BaseObject {

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
