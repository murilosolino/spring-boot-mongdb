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

    public void delete(String id){
        findById(id);
        userRepository.deleteById(id);
    }

    public User update(User obj){
        User newObj = findById(obj.getId());
        updateData(newObj, obj);
        return userRepository.save(newObj);
    }

    public User fromDTO(UserDTO dto){
        return new User(dto.getId(), dto.getName(), dto.getEmail());
    }

    public void updateData(User newObj, User obj){
        newObj.setName(obj.getName());
        newObj.setEmail(obj.getEmail());
    }

}
