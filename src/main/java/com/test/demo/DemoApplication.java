package com.test.demo;

import com.test.demo.config.SolrPropertyConfig;
import com.test.demo.config.PropertyConfig;
import com.test.demo.document.Product;
import com.test.demo.service.SolrService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.List;

@SpringBootApplication
public class DemoApplication {
	public static void main(String[] args) {
		ConfigurableApplicationContext cnx = SpringApplication.run(DemoApplication.class, args);
		PropertyConfig bean = cnx.getBean(PropertyConfig.class);

		SolrPropertyConfig bean1 = cnx.getBean(SolrPropertyConfig.class);
		System.out.println(bean1.getSolrHost());

		SolrService bean2 = cnx.getBean(SolrService.class);
		Iterable<Product> allResults = bean2.getAllResults();
        for (Product allResult : allResults) {
            System.out.println(allResult.toString());
        }


    }
}
