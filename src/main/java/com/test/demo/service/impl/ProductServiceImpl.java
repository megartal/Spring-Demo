package com.test.demo.service.impl;

import com.test.demo.domain.Product;
import com.test.demo.repositories.h2.ProductRepository;
import com.test.demo.service.interf.ProductService;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * @author Akbar
 * @since 4/21/2018
 */
@Service
public class ProductServiceImpl implements ProductService{
    private ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public Iterable<Product> listAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public Optional<Product> getProductById(Integer id) {
        return productRepository.findById(id);
    }

    @Override
    public Product saveProduct(Product product) {
        return productRepository.save(product);
    }

    @Override
    public void deleteProduct(Integer id) {
        productRepository.deleteById(id);
    }
}
