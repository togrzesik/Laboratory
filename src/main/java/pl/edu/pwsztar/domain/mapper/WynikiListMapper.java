package pl.edu.pwsztar.domain.mapper;

import org.springframework.stereotype.Component;

import pl.edu.pwsztar.domain.dto.WynikiDto;
import pl.edu.pwsztar.domain.entity.Wyniki;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class WynikiListMapper {
    public List<WynikiDto> convert(List<Wyniki> results) {
        List<WynikiDto> resultsDto = new ArrayList<>();
        for (Wyniki result : results) {
            WynikiDto resultDto = new WynikiDto();

            resultDto.setId_wynikow(result.getId_wynikow());
            resultDto.setChoroby(result.getChoroby());
            resultDto.setPracownik_id(result.getPracownik_id());
            resultDto.setPacjent_id(result.getPacjent_id());

            resultsDto.add(resultDto);
        }
        return resultsDto;
    }
}
