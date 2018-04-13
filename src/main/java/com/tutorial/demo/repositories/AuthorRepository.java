package com.tutorial.demo.repositories;

import com.tutorial.demo.model.Author;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Tahoe on 4/7/2018.
 */
public interface AuthorRepository extends CrudRepository<Author, Integer>{
}
