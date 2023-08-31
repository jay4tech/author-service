package com.library.author.entity;


import com.library.author.model.Book;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;


@Entity(name="AUTHOR")
@Data
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String country;
    @ElementCollection(targetClass=String.class)
    private List<String> bookIds;
    @Transient
    private List<Book> books;
}