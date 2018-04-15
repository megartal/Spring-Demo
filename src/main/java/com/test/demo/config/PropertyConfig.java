package com.test.demo.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Tahoe on 4/13/2018.
 */
@Configuration
public class PropertyConfig {
    @Value("${solr.host}")
    String SolrHost;

    public String getSolrHost() {
        return SolrHost;
    }
}
