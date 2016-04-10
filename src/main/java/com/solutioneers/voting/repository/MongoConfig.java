package com.solutioneers.voting.repository;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.mongodb.Mongo;
import com.mongodb.MongoClient;

@EnableMongoRepositories
@Configuration
public class MongoConfig extends AbstractMongoConfiguration {

	@Override
	protected String getDatabaseName() {
		return "voting";
	}

	@Override
	public Mongo mongo() throws Exception {
		return new MongoClient("localhost", 27017);
	}

}
