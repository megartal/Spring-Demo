package com.tutorial.demo;

import com.tutorial.demo.service.SolrService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext cnx = SpringApplication.run(DemoApplication.class, args);
		SolrService solrService = cnx.getBean(SolrService.class);
		solrService.getResult("A Game of Thrones");
		solrService.getAllResults();
	}
}
