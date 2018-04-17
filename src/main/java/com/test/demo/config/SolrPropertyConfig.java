package com.test.demo.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Tahoe on 4/14/2018.
 */
@Configuration
public class SolrPropertyConfig {

    @Value("${solr.host}")
    private String solrHost;

    public String getSolrHost() {
        return solrHost;
    }
}
