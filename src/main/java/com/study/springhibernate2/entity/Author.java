package com.study.springhibernate2.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Entity
public class Author {
    @Id
    private Integer authorId;
    private String name;
    private String email;
    @OneToMany(mappedBy = "author", cascade = CascadeType.ALL, orphanRemoval = true)  //default lazy
    private List<Book> books;
}
