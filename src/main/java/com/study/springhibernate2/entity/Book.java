package com.study.springhibernate2.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@Getter
@Setter
@Entity
public class Book {
    @Id
    private Integer bookId;
    private String title;
    private String description;
    private LocalDate published;
    private Double price;
    private Integer rating;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "authorId")
    private Author author;
}
