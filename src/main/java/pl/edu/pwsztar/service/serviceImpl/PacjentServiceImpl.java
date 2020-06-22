package pl.edu.pwsztar.service.serviceImpl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.edu.pwsztar.domain.dto.CreatePacjentDto;
import pl.edu.pwsztar.domain.dto.PacjentDto;
import pl.edu.pwsztar.domain.entity.Pacjent;
import pl.edu.pwsztar.domain.mapper.CreatePacjentMapper;
import pl.edu.pwsztar.domain.mapper.PacjentListMapper;
import pl.edu.pwsztar.domain.repository.PacjentRepository;
import pl.edu.pwsztar.service.PacjentService;
import java.util.List;

@Service
public class PacjentServiceImpl implements PacjentService {

    private static final Logger LOGGER = LoggerFactory.getLogger(PacjentServiceImpl.class);

    private final PacjentRepository pacjentRepository;
    private final PacjentListMapper pacjentListMapper;
    private final CreatePacjentMapper createPacjentMapper;

    @Autowired
    public PacjentServiceImpl(PacjentRepository pacjentRepository,
                              PacjentListMapper productListMapper,
                              CreatePacjentMapper createPacjentMapper) {

        this.pacjentRepository = pacjentRepository;
        this.pacjentListMapper = productListMapper;
        this.createPacjentMapper = createPacjentMapper;
    }

    @Override
    public List<PacjentDto> findAll() {
        List<Pacjent> clients = pacjentRepository.findAll();
        return pacjentListMapper.convert(clients);
    }

    @Override
    public void save(CreatePacjentDto createPacjentDto) {
        pacjentRepository.save(createPacjentMapper.createPacjentDtoToPacjent(createPacjentDto));
    }

    @Override
    public void deleteById(Integer id_pacjenta){
        pacjentRepository.deleteById(id_pacjenta);
    }

    @Override
    public void getRequiredClientDetails(Integer id_pacjenta){
        pacjentRepository.getRequiredClientDetails(id_pacjenta);
    }
}
