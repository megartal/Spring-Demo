package com.test.demo.service;

import com.test.demo.model.Book;
import com.test.demo.repositories.BookRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * @author Akbar
 * @since 4/21/2018
 */
@Service
public class BookServiceImpl implements BookService{

    private final BookRepository bookRepository;

    public BookServiceImpl(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public Optional<Book> findBookByTitle(String title) {
        return bookRepository.findByTitle(title);
    }

    @Override
    public Optional<Book> findBookByGenre(String genre) {
        return bookRepository.findByGenre(genre);
    }

    @Override
    public Iterable<Book> findAllBooks() {
        return bookRepository.findAll();
    }

    @Override
    public String addBook(String title, String genre) {
        Book book;
        if (genre == null){
            book = new Book(title);
        } else {
            book = new Book(title, genre);
        }
        bookRepository.save(book);
        return "saved";
    }

    @Override
    public List<Book> findBookInCustomQuery(String title) {
        return bookRepository.getBookNameLike(title);
    }
}
