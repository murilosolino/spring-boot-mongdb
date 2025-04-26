package com.personalproject.springbootmongodb.service;

import com.personalproject.springbootmongodb.domain.User;
import com.personalproject.springbootmongodb.repository.UserRepository;
import com.personalproject.springbootmongodb.service.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> findAll(){
        return userRepository.findAll();
    }

    public  User findById(String id){
        User user = userRepository.findById(id).
                orElseThrow(() -> new ObjectNotFoundException("USER NOT FOUND"));
        return user;
    }

}
