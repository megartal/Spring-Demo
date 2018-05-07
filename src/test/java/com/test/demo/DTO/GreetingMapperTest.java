package com.test.demo.DTO;

import com.test.demo.domain.Greeting;
import com.test.demo.mapper.GreetingMapper;
import com.test.demo.model.GreetingDTO;
import org.junit.Assert;
import org.junit.Test;

/**
 * @Author Akbar
 * @DATE 5/8/2018.
 */
public class GreetingMapperTest {
    GreetingMapper greetingMapper = GreetingMapper.INSTANCE;

    @Test
    public void greetingToGreetingDTO() throws Exception{
        Greeting greeting = new Greeting();


        GreetingDTO greetingDTO = greetingMapper.greetingToGreetingDTO(greeting);

        Assert.assertEquals(greeting, greeting);
    }
}
