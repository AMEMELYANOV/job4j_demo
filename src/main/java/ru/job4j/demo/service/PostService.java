package ru.job4j.demo.service;

import org.springframework.stereotype.Service;
import ru.job4j.demo.model.Post;
import ru.job4j.demo.repository.PostRepository;

import java.util.List;

@Service
public class PostService {
    private final PostRepository postRepository;

    public PostService(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    public List<Post> findAll() {
        return (List<Post>) postRepository.findAll();
    }
}
