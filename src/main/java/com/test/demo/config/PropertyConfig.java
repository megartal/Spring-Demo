package com.test.demo.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;

import javax.annotation.Resource;
import javax.annotation.Resources;

/**
 * Created by Tahoe on 4/13/2018.
 */
@Configuration
@PropertySources({
        @PropertySource("classpath:datasource.properties"),
        @PropertySource("classpath:secondDatasource.properties")
})
public class PropertyConfig {

    @Autowired
    Environment environment;

    @Value("${demo.username}")
    String userName;

    @Value("${demo.password}")
    String password;

    @Value("${demo.dburl}")
    String dburl;

    @Value("${demo2.username}")
    String userName2;

    @Value("${demo2.password}")
    String password2;

    @Value("${demo2.dburl}")
    String dburl2;

    @Bean
    public static PropertySourcesPlaceholderConfigurer properties(){
        return new PropertySourcesPlaceholderConfigurer();
    }

    public Environment getEnvironment() {
        return environment;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public String getDburl() {
        return dburl;
    }

    public String getUserName2() {
        return userName2;
    }

    public String getPassword2() {
        return password2;
    }

    public String getDburl2() {
        return dburl2;
    }
}
