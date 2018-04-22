package com.test.demo.repositories;

import org.apache.solr.common.SolrDocumentList;

/**
 * @author Akbar
 * @since 4/22/2018
 */
public interface SolrProductRepositoryCustom {
    SolrDocumentList getProductsUsingCustomQuery(String name);
}
