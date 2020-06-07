package pl.edu.pwsztar.service;

import pl.edu.pwsztar.domain.dto.CreateRecepieDto;
import pl.edu.pwsztar.domain.dto.ProductDto;
import pl.edu.pwsztar.domain.dto.RecepieDto;
import pl.edu.pwsztar.domain.dto.SimpleRecepieDto;


import java.util.List;

public interface RecepieService {
    RecepieDto getRecepieDetails(Long recepieId);
    void save(CreateRecepieDto createRecepieDto);
    void deleteById(Long id);
    List<SimpleRecepieDto> getSimpleRecepies();
    List<SimpleRecepieDto> filterRecepies(List<ProductDto> productDtoList);
}
