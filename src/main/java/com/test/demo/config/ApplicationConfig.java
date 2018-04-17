package com.test.demo.config;

import org.apache.solr.client.solrj.SolrClient;
import org.apache.solr.client.solrj.impl.HttpSolrClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.solr.core.SolrOperations;
import org.springframework.data.solr.core.SolrTemplate;
import org.springframework.data.solr.repository.config.EnableSolrRepositories;

/**
 * Created by Tahoe on 4/12/2018.
 */
@Configuration
@EnableSolrRepositories(
        basePackages = "com.test.demo.repositories"
)
@ComponentScan
public class ApplicationConfig {
    private final SolrPropertyConfig solrPropertyConfig;

    public ApplicationConfig(SolrPropertyConfig solrPropertyConfig) {
        this.solrPropertyConfig = solrPropertyConfig;
    }

    @Bean
    public SolrClient solrClient() throws Exception {
        return new HttpSolrClient.Builder(solrPropertyConfig.getSolrHost()).build();
    }

    @Bean
    public SolrOperations solrTemplate() throws Exception {
        return new SolrTemplate(solrClient());
    }
}
