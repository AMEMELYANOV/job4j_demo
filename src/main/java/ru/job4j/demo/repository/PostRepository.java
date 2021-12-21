package ru.job4j.demo.repository;

import org.springframework.data.repository.CrudRepository;
import ru.job4j.demo.model.Post;

public interface PostRepository extends CrudRepository <Post, Integer>  {
}
