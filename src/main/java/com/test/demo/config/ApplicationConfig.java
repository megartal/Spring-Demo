package com.test.demo.config;

import org.apache.solr.client.solrj.SolrClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.solr.SolrAutoConfiguration;
import org.springframework.boot.autoconfigure.solr.SolrProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.solr.core.SolrOperations;
import org.springframework.data.solr.core.SolrTemplate;
import org.springframework.data.solr.repository.config.EnableSolrRepositories;
import org.springframework.data.solr.server.support.EmbeddedSolrServerFactory;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

/**
 * Created by Tahoe on 4/12/2018.
 */
//@Configuration
//@EnableSolrRepositories(
//        basePackages = "com.tutorial.demo.repositories"
//)
//@ComponentScan
//public class ApplicationConfig {
//    @Bean
//    public SolrClient solrClient() throws Exception {
//        EmbeddedSolrServerFactory factory = new EmbeddedSolrServerFactory("classpath:com/acme/solr");
//        return factory.getSolrServer();
//    }
//
//    @Bean
//    public SolrOperations solrTemplate() throws Exception {
//        return new SolrTemplate(solrClient());
//    }
//}
