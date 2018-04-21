package com.test.demo.repositories;

import com.test.demo.model.Book;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

/**
 * Created by Akbar on 4/7/2018.
 */
public interface BookRepository extends CrudRepository<Book, Integer> {
    Optional<Book> findByTitle(String title);
}
