package com.tutorial.demo.repositories;

import com.tutorial.demo.model.Book;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Tahoe on 4/7/2018.
 */
public interface BookRepository extends CrudRepository<Book, Integer> {
}
