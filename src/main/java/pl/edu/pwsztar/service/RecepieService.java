package pl.edu.pwsztar.service;

import pl.edu.pwsztar.domain.dto.RecepieDto;


import java.util.List;

public interface RecepieService {
    List<RecepieDto> findAll();
    //void save(CreateRecepieDto createRecepieDto);
    void deleteById(Long id);

}
