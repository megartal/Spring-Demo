package com.test.demo.configuration;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author Akbar
 * @since 4/21/2018
 */
@Configuration
@EnableAutoConfiguration
@EntityScan(basePackages = {"com.test.demo.domain"})
@EnableJpaRepositories(basePackages = {"com.test.demo.repositories"})
@EnableTransactionManagement
public class RepositoryConfiguration {
}
