package com.personalproject.springbootmongodb.config;

import com.personalproject.springbootmongodb.domain.Post;
import com.personalproject.springbootmongodb.domain.User;
import com.personalproject.springbootmongodb.dto.AuthorDTO;
import com.personalproject.springbootmongodb.repository.PostRepository;
import com.personalproject.springbootmongodb.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.Arrays;

@Configuration
public class Initiation implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

   @Autowired
    private PostRepository postRepository;

    @Override
    public void run(String... args) throws Exception {

        userRepository.deleteAll();
        postRepository.deleteAll();

        User user1 = new User(null, "João Silva", "joao.silva@example.com");
        User user2 = new User(null, "Maria Oliveira", "maria.oliveira@example.com");
        User user3 = new User(null, "Carlos Santos", "carlos.santos@example.com");

        userRepository.saveAll(Arrays.asList(user1,user2,user3));

        Post post1 = new Post(null, LocalDate.of(2023, 10, 1), "Título 1", "Conteúdo do post 1", new AuthorDTO(user1));
        Post post2 = new Post(null, LocalDate.of(2023, 10, 2), "Título 2", "Conteúdo do post 2",new AuthorDTO(user2));
        Post post3 = new Post(null, LocalDate.of(2023, 10, 3), "Título 3", "Conteúdo do post 3",new AuthorDTO(user3));

        postRepository.saveAll(Arrays.asList(post1,post2,post3));

    }
}
