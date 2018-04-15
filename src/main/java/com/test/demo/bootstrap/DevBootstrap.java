package com.test.demo.bootstrap;

import com.test.demo.model.Book;
import com.test.demo.repositories.AuthorRepository;
import com.test.demo.repositories.BookRepository;
import com.test.demo.model.Author;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.HashSet;

/**
 * Created by Tahoe on 4/7/2018.
 */
@Component
public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent> {

    private BookRepository bookRepository;
    private AuthorRepository authorRepository;

    public DevBootstrap(BookRepository bookRepository, AuthorRepository authorRepository) {
        this.bookRepository = bookRepository;
        this.authorRepository = authorRepository;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        initData();
    }

    private void initData() {
        Author charles = new Author("charles", "Dickens");
        Book greatExpectations = new Book("Great Expectations", "novel", new HashSet<>(Arrays.asList(charles)));
        charles.getBooks().add(greatExpectations);
        greatExpectations.getAuthors().add(charles);
        bookRepository.save(greatExpectations);
        authorRepository.save(charles);

        Author Jane = new Author("Jane", "Austen");
        Book loveStory = new Book("Pride and Prejudice", "novel", new HashSet<>(Arrays.asList(Jane)));
        Jane.getBooks().add(loveStory);
        loveStory.getAuthors().add(Jane);
        bookRepository.save(loveStory);
        authorRepository.save(Jane);
    }
}
