package com.test.demo.controllers;

import com.test.demo.model.Book;
import com.test.demo.service.BookService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

/**
 * @author Akbar
 * @since 4/15/2018
 */
@RestController
public class BookRestController {
    private final BookService bookService;

    public BookRestController(BookService bookService) {
        this.bookService = bookService;
    }

    @RequestMapping("/book")
    public Optional<Book> getBook(@RequestParam(value = "title", defaultValue = "Great Expectations") String title) {
        return bookService.findBookByTitle(title);
    }

    @RequestMapping("/books")
    public Iterable<Book> getBooks(){
        return bookService.findAllBooks();
    }


    @RequestMapping("/book/add")
    public String add(@RequestParam(value = "title", required = true) String title, @RequestParam(value = "genre", required = false) String genre){
        return bookService.addBook(title, genre);
    }

    @RequestMapping("/book/like")
    public List<Book> getBookUsingCustomQuery(@RequestParam(value = "title") String title) {
        return bookService.findBookInCustomQuery(title);
    }
}
