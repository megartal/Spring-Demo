package com.test.demo;

import com.test.demo.document.Product;
import com.test.demo.service.SolrService;
import com.test.demo.service.SolrServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext cnx = SpringApplication.run(DemoApplication.class, args);
		SolrService solrService = cnx.getBean(SolrServiceImpl.class);
        System.out.println("results from spring data solr query:");
        for (Product product : solrService.getResult("The Lightning Thief")) {
            System.out.println(product.getName());
        }
        System.out.println();
        System.out.println("results from custom solr query: ");
        for (String s : solrService.getSolrResultsUsingCustomQuery("The Sea of Monsters")) {
            System.out.println(s);
        }
    }
}
