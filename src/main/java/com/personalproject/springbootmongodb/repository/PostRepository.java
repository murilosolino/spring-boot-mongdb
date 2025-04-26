package com.personalproject.springbootmongodb.repository;

import com.personalproject.springbootmongodb.domain.Post;
import com.personalproject.springbootmongodb.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {
}
