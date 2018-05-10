package com.test.demo.repositories.h2;

import com.test.demo.domain.Book;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Optional;

import static org.junit.Assert.*;

/**
 * @Author Akbar
 * @DATE 5/10/2018.
 */
@RunWith(SpringRunner.class)
@DataJpaTest
public class BookRepositoryIT {

    @Autowired
    BookRepository bookRepository;

    @Before
    public void setUp() throws Exception {

    }

    @Test
//    @DirtiesContext
    public void findByTitle() throws Exception {
        Optional<Book> byTitle = bookRepository.findByTitle("great Expectations");

        assertEquals("novel", byTitle.get().getGenre());
    }

    @Test
    public void findByGenre() throws Exception {
        Optional<Book> byGenre = bookRepository.findByTitle("fiction");

        assertEquals("Pride and Prejudice", byGenre.get().getTitle());

    }

}