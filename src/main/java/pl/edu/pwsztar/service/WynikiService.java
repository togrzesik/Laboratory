package pl.edu.pwsztar.service;

import pl.edu.pwsztar.domain.dto.CreateWynikiDto;
import pl.edu.pwsztar.domain.dto.WynikiDto;

import java.util.List;


public interface WynikiService {
    List<WynikiDto> findAll();
    List<WynikiDto> getResultDetails(Integer id_wynikow);
    void save(CreateWynikiDto createWynikiDto);

}
