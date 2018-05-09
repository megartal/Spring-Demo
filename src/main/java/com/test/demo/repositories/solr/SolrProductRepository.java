package com.test.demo.repositories.solr;

import com.test.demo.document.Product;
import org.springframework.data.solr.repository.SolrCrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by akbar on 4/12/2018.
 */
@Repository
public interface SolrProductRepository extends SolrCrudRepository<Product, String>, SolrProductRepositoryCustom {
    public List<Product> findByName(String name);
}
