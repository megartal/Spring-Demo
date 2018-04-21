package com.test.demo.service;

import com.test.demo.document.Product;
import com.test.demo.repositories.SolrBookRepository;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Akbar on 4/13/2018.
 */
@Service
public class SolrServiceImpl implements SolrService{
    private SolrBookRepository solrBookRepository;

    public SolrServiceImpl(SolrBookRepository solrBookRepository) {
        this.solrBookRepository = solrBookRepository;
    }

    public List<Product> getResult(String name){
        return solrBookRepository.findByName(name);
    }

    public Iterable<Product> getAllResults(){
        return solrBookRepository.findAll();
    }
}
