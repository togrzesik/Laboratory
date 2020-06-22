package pl.edu.pwsztar.service.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.edu.pwsztar.domain.dto.CreatePracownikDto;
import pl.edu.pwsztar.domain.dto.PracownikDto;
import pl.edu.pwsztar.domain.entity.Pacjent;
import pl.edu.pwsztar.domain.entity.Pracownik;
import pl.edu.pwsztar.domain.mapper.CreatePracownikMapper;
import pl.edu.pwsztar.domain.mapper.PracownikListMapper;
import pl.edu.pwsztar.domain.repository.PracownikRepository;
import pl.edu.pwsztar.service.PracownikService;

import java.util.List;

@Service
public class PracownikServiceImpl implements PracownikService {

    private final PracownikRepository pracownikRepository;
    private final PracownikListMapper pracownikListMapper;
    private final CreatePracownikMapper createPracownikMapper;

    @Autowired
    public PracownikServiceImpl(PracownikRepository pracownikRepository,
                                PracownikListMapper pracownikListMapper,
                                CreatePracownikMapper createPracownikMapper) {
        this.pracownikRepository = pracownikRepository;
        this.pracownikListMapper = pracownikListMapper;
        this.createPracownikMapper = createPracownikMapper;
    }

    @Override
    public List<PracownikDto> findAll() {
        List<Pracownik> workers = pracownikRepository.findAll();
        return pracownikListMapper.convert(workers);
    }

    @Override
    public List<PracownikDto> getRequiredWorkerDetails(Integer id_pracownika) {
        return pracownikListMapper.convert(pracownikRepository.getRequiredWorkerDetails(id_pracownika));
    }

    @Override
    public void save(CreatePracownikDto createPracownikDto){
        pracownikRepository.save(createPracownikMapper.mapPracownikDtoToPracownik(createPracownikDto));
    }

    @Override
    public void deleteById(Integer id_pracownika) {
        pracownikRepository.deleteById(id_pracownika);
    }
}
