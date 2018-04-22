package com.test.demo.bootstrap;

import com.test.demo.model.Author;
import com.test.demo.model.Book;
import com.test.demo.model.Product;
import com.test.demo.repositories.AuthorRepository;
import com.test.demo.repositories.BookRepository;
import com.test.demo.repositories.ProductRepository;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.HashSet;

/**
 * Created by Akbar on 4/7/2018.
 */
@Component
public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent> {

    private BookRepository bookRepository;
    private AuthorRepository authorRepository;
    private ProductRepository productRepository;

    public DevBootstrap(BookRepository bookRepository, AuthorRepository authorRepository, ProductRepository productRepository) {
        this.bookRepository = bookRepository;
        this.authorRepository = authorRepository;
        this.productRepository = productRepository;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        initData();
    }

    private void initData() {
        Author charles = new Author("charles", "Dickens");
        Book greatExpectations = new Book("great Expectations", "novel", new HashSet<>(Arrays.asList(charles)));
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

        Product shirt = new Product();
        shirt.setDescription("mobile");
        shirt.setPrice(new BigDecimal("18.95"));
        shirt.setImageUrl("http://mobile.jpg");
        shirt.setProductId("235268845711068308");
        productRepository.save(shirt);

        Product mug = new Product();
        mug.setDescription("computer");
        mug.setImageUrl("http://computer.jpg");
        mug.setProductId("168639393495335947");
        mug.setPrice(new BigDecimal("11.95"));
        productRepository.save(mug);

    }
}
