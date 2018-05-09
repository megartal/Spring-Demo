package com.test.demo.mapper;

import com.test.demo.domain.Greeting;
import com.test.demo.model.GreetingDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * @Author Akbar
 * @DATE 5/7/2018.
 */
@Mapper(componentModel = "spring")
public interface GreetingMapper {
    GreetingMapper INSTANCE = Mappers.getMapper(GreetingMapper.class);

    GreetingDTO greetingToGreetingDTO(Greeting greeting);
}
