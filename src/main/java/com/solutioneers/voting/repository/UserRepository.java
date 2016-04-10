package com.solutioneers.voting.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.solutioneers.voting.dto.User;

public interface UserRepository extends
		PagingAndSortingRepository<User, String> {
	public User findByEmail(String email);
}
