package com.personalproject.springbootmongodb.config;

import com.personalproject.springbootmongodb.domain.User;
import com.personalproject.springbootmongodb.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
public class Initiation implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {

        userRepository.deleteAll();

        User user1 = new User(null, "João Silva", "joao.silva@example.com");
        User user2 = new User(null, "Maria Oliveira", "maria.oliveira@example.com");
        User user3 = new User(null, "Carlos Santos", "carlos.santos@example.com");

        userRepository.saveAll(Arrays.asList(user1,user2,user3));

    }
}
