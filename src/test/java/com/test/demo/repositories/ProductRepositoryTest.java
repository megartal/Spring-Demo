package com.test.demo.repositories;

import com.test.demo.model.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.Optional;

/**
 * @author Akbar
 * @since 4/21/2018
 */
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment= SpringBootTest.WebEnvironment.RANDOM_PORT)
public class ProductRepositoryTest {

    private ProductRepository productRepository;

    @Autowired
    public void setProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Test
    public void testSaveProduct(){
        Product product = new Product();
        product.setDescription("mobile");
        product.setPrice(new BigDecimal("18.95"));
        product.setProductId("1234");

        Assert.assertNull(product.getId());
        productRepository.save(product);
        Assert.assertNotNull(product.getId());

        Optional<Product> fetchedProduct = productRepository.findById(product.getId());

        Assert.assertNotNull(fetchedProduct);

        Assert.assertEquals(product.getId(), fetchedProduct.get().getId());
        Assert.assertEquals(product.getDescription(), fetchedProduct.get().getDescription());

        fetchedProduct.get().setDescription("New Description");
        productRepository.save(fetchedProduct.get());

        Optional<Product> fetchedUpdatedProduct = productRepository.findById(fetchedProduct.get().getId());
        Assert.assertEquals(fetchedProduct.get().getDescription(), fetchedUpdatedProduct.get().getDescription());

        long productCount = productRepository.count();
        Assert.assertEquals(productCount, 3);

        Iterable<Product> products = productRepository.findAll();

        int count = 0;

        for(Product p : products){
            count++;
        }

        Assert.assertEquals(count, 3);
    }
}
