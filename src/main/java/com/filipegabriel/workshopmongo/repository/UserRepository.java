package com.filipegabriel.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.filipegabriel.workshopmongo.domain.User;

public interface UserRepository extends MongoRepository<User, String>{
	
}
