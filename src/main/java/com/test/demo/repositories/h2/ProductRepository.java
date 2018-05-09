package com.test.demo.repositories.h2;

import com.test.demo.domain.Product;
import org.springframework.data.repository.CrudRepository;

/**
 * @author Akbar
 * @since 4/21/2018
 */
public interface ProductRepository extends CrudRepository<Product, Integer> {
}
