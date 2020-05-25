package pl.edu.pwsztar.domain.mapper;


import org.springframework.stereotype.Component;
import pl.edu.pwsztar.domain.dto.CreateRecepieDto;
import pl.edu.pwsztar.domain.entity.Recepie;

@Component
public class CreateRecepieMapper {

    public Recepie mapRecepieDtoToRecepie(CreateRecepieDto createRecepieDto) {

        Recepie recepie = new Recepie();

        recepie.setName(createRecepieDto.getName());
        recepie.setImage(createRecepieDto.getImage());
        recepie.setDescription(createRecepieDto.getDescription());
        
        return recepie;
    }
}
