package com.solutioneers.voting.dto;

import java.util.LinkedHashMap;
import java.util.Map;

public class Question{
	private String title;
	private String description;
	private String userId;
	private Map<String, Integer> votesPerUser = new LinkedHashMap<String, Integer>();

}
