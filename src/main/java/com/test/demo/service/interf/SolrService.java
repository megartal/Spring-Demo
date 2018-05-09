package com.test.demo.service.interf;

import com.test.demo.document.Product;

import java.util.List;

/**
 * Created by Akbar on 4/13/2018.
 */

public  interface SolrService {
    public List<Product> getResult(String name);
    public Iterable<Product> getAllResults();
    public List<String> getSolrResultsUsingCustomQuery(String name);
}
