package pl.edu.pwsztar.domain.mapper;


import org.springframework.stereotype.Component;
import pl.edu.pwsztar.domain.dto.CreateWynikiDto;
import pl.edu.pwsztar.domain.entity.Wyniki;

@Component
public class CreateWynikiMapper {

    public Wyniki mapWynikiDtoToWyniki(CreateWynikiDto createWynikiDto) {

        Wyniki wyniki = new Wyniki();

        wyniki.setId_wynikow(createWynikiDto.getId_wynikow());
        wyniki.setChoroby(createWynikiDto.getChoroby());
        wyniki.setPracownik_id(createWynikiDto.getPracownik_id());
        wyniki.setPacjent_id(createWynikiDto.getPacjent_id());

        return wyniki;
    }
}
