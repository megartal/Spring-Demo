package com.test.demo.repositories;

import com.test.demo.model.Product;
import org.springframework.data.repository.CrudRepository;

/**
 * @author Akbar
 * @since 4/21/2018
 */
public interface ProductRepository extends CrudRepository<Product, Integer> {
}
