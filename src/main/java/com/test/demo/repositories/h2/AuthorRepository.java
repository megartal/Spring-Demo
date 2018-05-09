package com.test.demo.repositories.h2;

import com.test.demo.domain.Author;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Akbar on 4/7/2018.
 */
public interface AuthorRepository extends CrudRepository<Author, Integer> {
    @Query(value = "select a from Author a")
    Iterable<Author> findAuthorByName();
}
