package com.solutioneers.voting.util;

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

}
