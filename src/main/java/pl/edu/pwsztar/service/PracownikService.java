package pl.edu.pwsztar.service;

import pl.edu.pwsztar.domain.dto.CreatePracownikDto;
import pl.edu.pwsztar.domain.dto.PracownikDto;

import java.util.List;

public interface PracownikService {
    List<PracownikDto> findAll();
    List<PracownikDto> getRequiredWorkerDetails(Integer id_pracownika);
    void save(CreatePracownikDto createPracownikDto);
    void deleteById(Integer id_pracownika);
}
