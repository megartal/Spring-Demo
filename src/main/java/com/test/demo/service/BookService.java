package com.test.demo.service;

import com.test.demo.model.Book;

import java.util.List;
import java.util.Optional;

/**
 * @author Akbar
 * @since 4/21/2018
 */
public interface BookService {
    public Optional<Book> findBookByTitle(String title);
    public Optional<Book> findBookByGenre(String genre);
    public Iterable<Book> findAllBooks();
    public String addBook(String title, String genre);
    public List<Book> findBookInCustomQuery(String title);
}
