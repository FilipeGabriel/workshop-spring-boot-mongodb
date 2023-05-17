package com.filipegabriel.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.filipegabriel.workshopmongo.domain.Post;

public interface PostRepository extends MongoRepository<Post, String>{
	
}
