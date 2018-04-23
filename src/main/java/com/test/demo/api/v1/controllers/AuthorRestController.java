package com.test.demo.api.v1.controllers;

import com.test.demo.model.Author;
import com.test.demo.repositories.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Akbar
 * @since 4/15/2018
 */
@RestController
public class AuthorRestController {
    private AuthorRepository authorRepository;
    @Autowired
    public AuthorRestController(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    @RequestMapping("/authors")
    public Iterable<Author> findAllAuthors(){
        return authorRepository.findAuthorByName();
    }
}
