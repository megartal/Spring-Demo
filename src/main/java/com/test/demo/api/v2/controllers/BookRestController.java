package com.test.demo.api.v2.controllers;

import com.test.demo.model.Book;
import com.test.demo.service.BookService;
import org.springframework.context.annotation.Profile;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

/**
 * @author Akbar
 * @since 4/23/2018
 */
@Profile("v2")
@RestController
@RequestMapping("/api/v2")
public class BookRestController {
    private final BookService bookService;

    public BookRestController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping(value = "/book", params = {"genre"})
    public Optional<Book> getBook(String genre) {
        return bookService.findBookByGenre(genre);
    }
}
