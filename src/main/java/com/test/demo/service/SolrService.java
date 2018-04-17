package com.test.demo.service;

import com.test.demo.document.Product;
import com.test.demo.repositories.SolrBookRepository;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by Tahoe on 4/13/2018.
 */
@Component
public class SolrService {
    private SolrBookRepository solrBookRepository;

    public SolrService(SolrBookRepository solrBookRepository) {
        this.solrBookRepository = solrBookRepository;
    }

    public Iterable<Product> getAllResults(){
        return solrBookRepository.findAll();
    }

}
