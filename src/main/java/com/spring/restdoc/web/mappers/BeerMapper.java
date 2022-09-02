package com.spring.restdoc.web.mappers;

import com.spring.restdoc.Domain.Beer;
import com.spring.restdoc.web.model.BeerDto;
import org.mapstruct.Mapper;

@Mapper(uses = {DateMapper.class})
public interface BeerMapper {
    BeerDto BeerToBeerDto(Beer beer);

    Beer BeerDtoToBeer(BeerDto dto);
}
