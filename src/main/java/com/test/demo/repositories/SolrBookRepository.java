package com.test.demo.repositories;

import com.test.demo.document.Product;
import org.springframework.data.solr.repository.SolrCrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by akbar on 4/12/2018.
 */
@Repository
public interface SolrBookRepository extends SolrCrudRepository<Product, String> {
    public List<Product> findByName(String name);
}
