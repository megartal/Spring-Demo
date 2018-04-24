package com.test.demo.model;

import lombok.Data;

/**
 * @author Akbar
 * @since 4/15/2018
 */
@Data
public class Greeting {
    private final long id;
    private final String content;

    public Greeting(long id, String content) {
        this.id = id;
        this.content = content;
    }
}
