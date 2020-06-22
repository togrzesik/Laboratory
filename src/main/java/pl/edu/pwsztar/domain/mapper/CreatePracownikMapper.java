package pl.edu.pwsztar.domain.mapper;

import org.springframework.stereotype.Component;
import pl.edu.pwsztar.domain.dto.CreatePracownikDto;
import pl.edu.pwsztar.domain.entity.Pracownik;

@Component
public class CreatePracownikMapper {

    public Pracownik mapPracownikDtoToPracownik(CreatePracownikDto createPracownikDto) {

        Pracownik pracownik = new Pracownik();

        pracownik.setId_pracownika(createPracownikDto.getId_pracownika());
        pracownik.setImie(createPracownikDto.getImie());
        pracownik.setNazwisko(createPracownikDto.getNazwisko());
        pracownik.setData_urodzenia(createPracownikDto.getData_urodzenia());
        pracownik.setNazwisko(createPracownikDto.getStanowisko());

        return pracownik;
    }
}
