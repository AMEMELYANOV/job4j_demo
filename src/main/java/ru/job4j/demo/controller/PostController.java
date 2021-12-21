package ru.job4j.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.job4j.demo.model.Post;
import ru.job4j.demo.service.PostService;
import java.util.List;

@RestController
@RequestMapping("/demo")
public class PostController {
    private final PostService postService;

    public PostController (PostService postService) {
        this.postService = postService;
    }

    @GetMapping("/findAll")
    public List<Post> findAll() {
        return postService.findAll();
    }
}
