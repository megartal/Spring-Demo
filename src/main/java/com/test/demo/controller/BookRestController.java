package com.test.demo.controller;

import com.test.demo.model.Book;
import com.test.demo.repositories.BookRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

/**
 * @author Akbar
 * @since 4/15/2018
 */
@RestController
public class BookRestController {
    private final BookRepository bookRepository;

    public BookRestController(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @RequestMapping("/book")
    public Optional<Book> getBook(@RequestParam(value = "title", defaultValue = "Great Expectations") String title) {
        return bookRepository.findByTitle(title);
    }

    @RequestMapping("/books")
    public Iterable<Book> getBooks(){
        return bookRepository.findAll();
    }


    @RequestMapping("/book/add")
    public String add(@RequestParam(value = "title", required = true) String title, @RequestParam(value = "genre", required = false) String genre){
        Book book;
        if (genre == null){
            book = new Book(title);
        } else {
            book = new Book(title, genre);
        }
        bookRepository.save(book);
        return "saved";
    }
}
