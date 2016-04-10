package com.solutioneers.voting.dto;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class User extends BaseObject {
	private String name;
	private String email;
	private List<String> channelIds = new ArrayList<String>();
	private Map<String, Integer> voteCountPerChannel = new LinkedHashMap<String, Integer>();

	public void addChannelId(String id) {
		channelIds.add(id);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<String> getChannelIds() {
		return channelIds;
	}

	public void setChannelIds(List<String> channelIds) {
		this.channelIds = channelIds;
	}

	public Map<String, Integer> getVoteCountPerChannel() {
		return voteCountPerChannel;
	}

	public void setVoteCountPerChannel(Map<String, Integer> voteCountPerChannel) {
		this.voteCountPerChannel = voteCountPerChannel;
	}

	public void putVotes(String channelId, int voteCount) {
		this.voteCountPerChannel.put(channelId, voteCount);
		
	}
}
