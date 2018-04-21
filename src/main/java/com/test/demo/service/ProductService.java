package com.test.demo.service;

import com.test.demo.model.Product;

import java.util.Optional;

/**
 * @author Akbar
 * @since 4/21/2018
 */
public interface ProductService {
    Iterable<Product> listAllProducts();

    Optional<Product> getProductById(Integer id);

    Product saveProduct(Product product);

    void deleteProduct(Integer id);
}
