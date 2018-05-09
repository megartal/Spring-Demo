package com.test.demo.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;

/**
 * @author Akbar
 * @since 4/21/2018
 */
@Entity
@Getter
@Setter
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Version
    private Integer version;

    private String productId;
    private String description;
    private String imageUrl;
    private BigDecimal price;
}
