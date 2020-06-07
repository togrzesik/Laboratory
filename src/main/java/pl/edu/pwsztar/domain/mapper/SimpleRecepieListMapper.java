package pl.edu.pwsztar.domain.mapper;

import org.springframework.stereotype.Component;
import pl.edu.pwsztar.domain.converter.Converter;
import pl.edu.pwsztar.domain.dto.SimpleRecepieDto;
import pl.edu.pwsztar.domain.entity.Recepie;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class SimpleRecepieListMapper implements Converter<List<Recepie>,List<SimpleRecepieDto>> {
    @Override
    public List<SimpleRecepieDto> convert(List<Recepie> from) {
        return from.stream().map(recepie -> new SimpleRecepieDto.Builder()
                .recepieId(recepie.getRecepieId())
                .name(recepie.getName())
                .image(recepie.getImage())
                .build()
            ).collect(Collectors.toList());
    }
}
