package com.test.demo.repositories;

import com.test.demo.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

/**
 * Created by Tahoe on 4/7/2018.
 */
public interface AuthorRepository extends CrudRepository<Author, Integer> {
    @Query(value = "select a from Author a")
    Iterable<Author> findAuthorByName();
}
