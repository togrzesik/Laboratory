package pl.edu.pwsztar.domain.mapper;

import org.springframework.stereotype.Component;
import pl.edu.pwsztar.domain.dto.PacjentDto;
import pl.edu.pwsztar.domain.entity.Pacjent;

import java.util.ArrayList;
import java.util.List;

@Component
public class PacjentListMapper {
    public List<PacjentDto> convert(List<Pacjent> clients) {
        List<PacjentDto> clientsDto = new ArrayList<>();
        for(Pacjent client: clients) {
            PacjentDto clientDto = new PacjentDto();

            clientDto.setId_pacjenta(client.getId_pacjenta());
            clientDto.setImie(client.getImie());
            clientDto.setNazwisko(client.getNazwisko());
            clientDto.setData_urodzenia(client.getData_urodzenia());
            clientDto.setNr_telefonu(client.getNr_telefonu());
            clientDto.setPesel(client.getPesel());
            clientsDto.add(clientDto);
        }
        return clientsDto;
    }
}
