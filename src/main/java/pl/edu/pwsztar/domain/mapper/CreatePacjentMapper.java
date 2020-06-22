package pl.edu.pwsztar.domain.mapper;

import org.springframework.stereotype.Component;
import pl.edu.pwsztar.domain.dto.CreatePacjentDto;
import pl.edu.pwsztar.domain.entity.Pacjent;

@Component
public class CreatePacjentMapper {

    public Pacjent createPacjentDtoToPacjent(CreatePacjentDto createPacjentDto) {

        Pacjent pacjent = new Pacjent();

        pacjent.setId_pacjenta(createPacjentDto.getId_pacjenta());
        pacjent.setImie(createPacjentDto.getImie());
        pacjent.setNazwisko(createPacjentDto.getNazwisko());
        pacjent.setData_urodzenia(createPacjentDto.getData_urodzenia());
        pacjent.setNr_telefonu(createPacjentDto.getNr_telefonu());
        pacjent.setPesel(createPacjentDto.getPesel());

        return pacjent;
    }
}