package com.test.demo.document;

import org.apache.solr.client.solrj.beans.Field;
import org.springframework.data.annotation.Id;
import org.springframework.data.solr.core.mapping.Indexed;
import org.springframework.data.solr.core.mapping.SolrDocument;

/**
 * Created by Tahoe on 4/13/2018.
 */
@SolrDocument(solrCoreName = "product")
public class Product {

    @Id
    @Indexed(name = "id", type = "string")
    private String id;

//    @Indexed(name = "cat", type = "string")
//    private String category;

    @Indexed(name = "name", type = "string")
    @Field
    private String name;

//    @Indexed(name = "price", type = "double")
//    @Field
//    private double price;
//
//    @Indexed(name = "cat", type = "string")
//    @Field
//    private boolean inStock;
//    @Indexed
//    @Field
//    private String series;
//    @Indexed
//    @Field
//    private int sequence;
//    @Indexed
//    @Field
//    private String genre;


    public Product(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public Product() {
    }

//    public String getCategory() {
//        return category;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public double getPrice() {
//        return price;
//    }
//
//    public boolean isInStock() {
//        return inStock;
//    }
//
//    public String getSeries() {
//        return series;
//    }
//
//    public int getSequence() {
//        return sequence;
//    }
//
//    public String getGenre() {
//        return genre;
//    }
//
//    public void setCategory(String category) {
//        this.category = category;
//    }

    public void setName(String name) {
        this.name = name;
    }

//    public void setPrice(double price) {
//        this.price = price;
//    }
//
//    public void setInStock(boolean inStock) {
//        this.inStock = inStock;
//    }
//
//    public void setSeries(String series) {
//        this.series = series;
//    }
//
//    public void setSequence(int sequence) {
//        this.sequence = sequence;
//    }
//
//    public void setGenre(String genre) {
//        this.genre = genre;
//    }
}
