package com.test.demo.domain;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/**
 * @author Akbar
 * @since 4/15/2018
 */
@Getter
@Setter
public class Greeting {
    private long id;
    private String content;
}
