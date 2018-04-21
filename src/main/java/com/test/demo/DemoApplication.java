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
        for (Product product : solrService.getAllResults()) {
            System.out.println(product.getName());
        }
	}
}
