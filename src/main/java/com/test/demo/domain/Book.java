package com.test.demo.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Akbar on 4/6/2018.
 */
@Entity
@Table(name = "book")
@Getter
@Setter
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String title;
    private String genre;
    @ManyToMany(cascade = {CascadeType.ALL})
    @JoinTable(name = "author_book", joinColumns = @JoinColumn(name = "book_id"),
            inverseJoinColumns = @JoinColumn(name = "author_id"))
    @JsonIgnore
    private Set<Author> authors = new HashSet<>();

    public Book(String title, String genre, Set<Author> authors) {
        this.title = title;
        this.genre = genre;
        this.authors = authors;
    }

    public Book(String title, String genre) {
        this.title = title;
        this.genre = genre;
    }

    public Book(String title) {
        this.title = title;
    }

    public Book() {
    }
}
