package com.test.demo.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Tahoe on 4/14/2018.
 */
@Configuration
public class ApplicationProperty {

    @Value("${demo.myTestProp}")
    private String myTestProp;

    @Value("${yamlfile.test}")
    private String yamlFileTest;

    public String getMyTestProp() {
        return myTestProp;
    }

    public String getYamlFileTest() {
        return yamlFileTest;
    }
}
