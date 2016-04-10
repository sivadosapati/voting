package com.solutioneers.voting.util;

import java.util.UUID;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Util {
	public static String toString(Object object) {
		if (object == null) {
			return null;
		}
		ObjectMapper objectMapper = new ObjectMapper();
		try {
			return objectMapper.writeValueAsString(object);
		} catch (Exception e) {
			e.printStackTrace();
			return object.toString();
		}
	}
	
	public static String getId(){
		return UUID.randomUUID().toString();
	}

	public static int getRandomNumber(int maxNumber) {
		return (int) (Math.random() * maxNumber);

	}
}
