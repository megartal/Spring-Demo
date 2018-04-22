package com.test.demo.service;

import com.test.demo.document.Product;
import com.test.demo.repositories.SolrProductRepository;
import org.apache.solr.common.SolrDocument;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Created by Akbar on 4/13/2018.
 */
@Service
public class SolrServiceImpl implements SolrService{
    private SolrProductRepository solrProductRepository;

    public SolrServiceImpl(SolrProductRepository solrProductRepository) {
        this.solrProductRepository = solrProductRepository;
    }

    public List<Product> getResult(String name){
        return solrProductRepository.findByName(name);
    }

    public Iterable<Product> getAllResults(){
        return solrProductRepository.findAll();
    }

    @Override
    public List<String> getSolrResultsUsingCustomQuery(String name) {
        ArrayList<String> list = new ArrayList<>();
        for (SolrDocument document : solrProductRepository.getProductsUsingCustomQuery(name)) {
            list.addAll((Collection<? extends String>) document.get("name"));
        }
        return list;
    }
}
