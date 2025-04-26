package com.personalproject.springbootmongodb.service;

import com.personalproject.springbootmongodb.domain.User;
import com.personalproject.springbootmongodb.dto.UserDTO;
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

    public User insert(User obj){
        return userRepository.insert(obj);
    }

    public User fromDTO(UserDTO dto){
        return new User(dto.getId(), dto.getName(), dto.getEmail());
    }


}
