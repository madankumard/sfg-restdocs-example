package mk.springframework.sfgrestdocsexample.web.mappers;

import mk.springframework.sfgrestdocsexample.domain.Beer;
import mk.springframework.sfgrestdocsexample.web.model.BeerDto;
import org.mapstruct.Mapper;

/**
 * Created by jt on 2019-05-25.
 */
@Mapper(uses = {DateMapper.class})
public interface BeerMapper {

    BeerDto BeerToBeerDto(Beer beer);

    Beer BeerDtoToBeer(BeerDto dto);
}
