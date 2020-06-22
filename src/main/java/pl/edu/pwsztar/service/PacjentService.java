package pl.edu.pwsztar.service;

import pl.edu.pwsztar.domain.dto.CreatePacjentDto;
import pl.edu.pwsztar.domain.dto.PacjentDto;

import java.util.List;

public interface PacjentService {

    List<PacjentDto> findAll();
    void save(CreatePacjentDto createPacjentDto);
    void deleteById(Integer id_pacjenta);
    void getRequiredClientDetails(Integer id_pacjenta);
}
