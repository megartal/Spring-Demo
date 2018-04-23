package com.test.demo.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * Created by Akbar on 4/14/2018.
 */
@Configuration
@Component
public class SolrPropertyConfig {

    @Value("${solr.host}")
    private String solrHost;

    @Value("${solr_core_test}")
    private String solrTestCore;

    public String getSolrHost() {
        return solrHost;
    }

    public String getSolrTestCore() {
        return solrTestCore;
    }
}
