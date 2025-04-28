package com.personalproject.springbootmongodb.service;

import com.personalproject.springbootmongodb.domain.Post;
import com.personalproject.springbootmongodb.repository.PostRepository;
import com.personalproject.springbootmongodb.service.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostService {

    @Autowired
    private PostRepository postRepository;

    public Post findById(String id){
        Post post = postRepository.findById(id).
                orElseThrow(() -> new ObjectNotFoundException("POST NOT FOUND"));
        return post;
    }

}
