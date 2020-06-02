package pl.edu.pwsztar.domain.mapper;

import org.springframework.stereotype.Component;
import pl.edu.pwsztar.domain.converter.Converter;
import pl.edu.pwsztar.domain.dto.RecepieDto;
import pl.edu.pwsztar.domain.entity.Recepie;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class RecepieMapper implements Converter<Recepie,RecepieDto> {
    @Override
    public RecepieDto convert(Recepie from) {
        return new RecepieDto.Builder()
                .recepieId(from.getRecepieId())
                .name(from.getName())
                .image(from.getImage())
                .description(from.getDescription())
                .build();
    }
}