package com.test.demo;

import com.test.demo.config.ApplicationProperty;
import com.test.demo.config.PropertyConfig;
import com.test.demo.service.SolrService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.Environment;

@SpringBootApplication
public class DemoApplication {
	public static void main(String[] args) {
		ConfigurableApplicationContext cnx = SpringApplication.run(DemoApplication.class, args);
		PropertyConfig bean = cnx.getBean(PropertyConfig.class);
		System.out.println(bean.getUserName());
		System.out.println(bean.getUserName2());

		ApplicationProperty bean1 = cnx.getBean(ApplicationProperty.class);
		System.out.println(bean1.getYamlFileTest());
	}
}
