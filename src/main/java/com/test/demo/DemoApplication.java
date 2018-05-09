package com.test.demo;

import com.test.demo.document.Product;
import com.test.demo.service.impl.SolrServiceImpl;
import com.test.demo.service.interf.SolrService;
import lombok.extern.log4j.Log4j2;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
@Log4j2
public class DemoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext cnx = SpringApplication.run(DemoApplication.class, args);
		SolrService solrService = cnx.getBean(SolrServiceImpl.class);
        System.out.println("results from spring data solr query njcedjncjdecen:");
        for (Product product : solrService.getResult("The Lightning Thief")) {
            System.out.println(product.getName());
        }
        System.out.println();
        log.info("this is a log using lombok.");
        System.out.println("results from custom solr query: ");
        for (String s : solrService.getSolrResultsUsingCustomQuery("The Sea of Monsters")) {
            System.out.println(s);
        }
    }
}
