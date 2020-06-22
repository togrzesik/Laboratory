package pl.edu.pwsztar.domain.mapper;


import org.springframework.stereotype.Component;
import pl.edu.pwsztar.domain.dto.PracownikDto;
import pl.edu.pwsztar.domain.entity.Pracownik;

import java.util.ArrayList;
import java.util.List;

@Component
public class PracownikListMapper {
    public List<PracownikDto> convert(List<Pracownik> workers) {
        List<PracownikDto> workersDto = new ArrayList<>();
        for(Pracownik worker: workers) {
            PracownikDto workerDto = new PracownikDto();

            workerDto.setId_pracownika(worker.getId_pracownika());
            workerDto.setImie(worker.getImie());
            workerDto.setNazwisko(worker.getNazwisko());
            workerDto.setData_urodzenia(worker.getData_urodzenia());
            workerDto.setStanowisko(worker.getStanowisko());

            workersDto.add(workerDto);
        }
        return workersDto;
    }
}
