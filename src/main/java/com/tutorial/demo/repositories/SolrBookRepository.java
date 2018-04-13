package com.tutorial.demo.repositories;

import com.tutorial.demo.documents.Product;
import org.springframework.context.annotation.Primary;
import org.springframework.data.solr.repository.SolrCrudRepository;

import java.util.List;

/**
 * Created by Tahoe on 4/12/2018.
 */
@Primary
public interface SolrBookRepository extends SolrCrudRepository<Product, String> {
    List<Product> findByName(String name);
}
