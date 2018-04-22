package com.test.demo.repositories;

import com.test.demo.model.Book;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

/**
 * @author Akbar
 * @since 4/22/2018
 */
@Repository
public class BookRepositoryImpl implements BookRepositoryCustom {
    @PersistenceContext
    EntityManager entityManager;

    @Override
    public List<Book> getBookNameLike(String title) {
        Query query = entityManager.createNativeQuery("SELECT * FROM book " +
                "WHERE title LIKE '" + title + "%'", Book.class);
//        query.setParameter(1, title + "%");
        return query.getResultList();
    }
}
