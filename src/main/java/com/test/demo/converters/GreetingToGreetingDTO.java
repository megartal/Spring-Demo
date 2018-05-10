package com.test.demo.converters;

import com.test.demo.domain.Greeting;
import com.test.demo.model.GreetingDTO;
import lombok.Synchronized;
import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;

/**
 * @Author Akbar
 * @DATE 5/10/2018.
 */
public class GreetingToGreetingDTO implements Converter<Greeting, GreetingDTO> {

    @Synchronized
    @Nullable
    @Override
    public GreetingDTO convert(Greeting greeting) {
        if(greeting == null){
            return null;
        }
        final GreetingDTO  greetingDTO = new GreetingDTO();
        greetingDTO.setId((int) greeting.getId());
        greetingDTO.setContent(greeting.getContent());
        return greetingDTO;
    }
}
