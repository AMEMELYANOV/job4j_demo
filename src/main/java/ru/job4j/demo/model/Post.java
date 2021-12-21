package ru.job4j.demo.model;

import lombok.Data;
import javax.persistence.*;

@Data
@Entity
@Table(name = "posts")
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
}
