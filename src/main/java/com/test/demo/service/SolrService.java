package com.test.demo.service;

import com.test.demo.repositories.SolrBookRepository;
import org.springframework.stereotype.Component;

/**
 * Created by Tahoe on 4/13/2018.
 */
@Component
public class SolrService {
    private SolrBookRepository solrBookRepository;

    public SolrService(SolrBookRepository solrBookRepository) {
        this.solrBookRepository = solrBookRepository;
    }

    public void getResult(String name){
        System.out.println(solrBookRepository.findByName(name));
    }

    public void getAllResults(){
        System.out.println(solrBookRepository.findAll());
    }

}
