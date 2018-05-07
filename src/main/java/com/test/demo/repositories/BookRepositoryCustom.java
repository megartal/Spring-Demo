package com.test.demo.repositories;

import com.test.demo.domain.Book;

import java.util.List;

/**
 * @author Akbar
 * @since 4/22/2018
 */
public interface BookRepositoryCustom {
    List<Book> getBookNameLike(String name);
}
