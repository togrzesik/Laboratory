package pl.edu.pwsztar.domain.mapper;


import org.springframework.stereotype.Component;
import pl.edu.pwsztar.domain.converter.Converter;
import pl.edu.pwsztar.domain.dto.ProductDto;
import pl.edu.pwsztar.domain.dto.RecepieDto;
import pl.edu.pwsztar.domain.entity.Recepie;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class RecepieListMapper implements Converter<List<Recepie>,List<RecepieDto>> {
    @Override
    public List<RecepieDto> convert(List<Recepie> from) {
        return from.stream().map(recepie -> new RecepieDto.Builder()
                .recepieId(recepie.getRecepieId())
                .name(recepie.getName())
                .image(recepie.getImage())
                .description(recepie.getDescription())
                .build()
            ).collect(Collectors.toList());
    }
}
