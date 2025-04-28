package com.personalproject.springbootmongodb.resources;

import com.personalproject.springbootmongodb.domain.Post;
import com.personalproject.springbootmongodb.domain.User;
import com.personalproject.springbootmongodb.dto.UserDTO;
import com.personalproject.springbootmongodb.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/posts")
public class PostResource {

    @Autowired
    private PostService postService;

    @GetMapping(value = "/{id}")
    public ResponseEntity<Post> findById(@PathVariable String id){
        Post post = postService.findById(id);
        return ResponseEntity.ok().body(post);
    }
}
