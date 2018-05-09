package com.test.demo.repositories.solr;

import org.apache.solr.client.solrj.SolrClient;
import org.apache.solr.client.solrj.SolrQuery;
import org.apache.solr.client.solrj.impl.HttpSolrClient;
import org.apache.solr.common.SolrDocumentList;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Repository;


/**
 * @author Akbar
 * @since 4/22/2018
 */
@Repository
@Configuration
public class SolrProductRepositoryCustomImpl implements SolrProductRepositoryCustom {

    SolrClient solr = new HttpSolrClient.Builder("http://192.168.82.165:8983/solr/test").build();
    @Override
    public SolrDocumentList getProductsUsingCustomQuery(String name) {
        SolrQuery solrQuery = new SolrQuery("*:*");
//        solrQuery.addFilterQuery("name: " + name);
        solrQuery.addField("name");
        try {
            return solr.query(solrQuery).getResults();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    }
}
