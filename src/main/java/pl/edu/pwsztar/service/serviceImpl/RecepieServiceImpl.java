package pl.edu.pwsztar.service.serviceImpl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.edu.pwsztar.domain.dto.CreateRecepieDto;
import pl.edu.pwsztar.domain.dto.RecepieDto;
import pl.edu.pwsztar.domain.dto.SimpleRecepieDto;
import pl.edu.pwsztar.domain.entity.Recepie;
import pl.edu.pwsztar.domain.mapper.CreateRecepieMapper;
import pl.edu.pwsztar.domain.mapper.RecepieListMapper;
import pl.edu.pwsztar.domain.mapper.SimpleRecepieListMapper;
import pl.edu.pwsztar.domain.repository.RecepieRepository;
import pl.edu.pwsztar.service.RecepieService;

import java.util.List;

@Service
public class RecepieServiceImpl implements RecepieService {

    private static final Logger LOGGER = LoggerFactory.getLogger(RecepieServiceImpl.class);

    private final RecepieRepository recepieRepository;
    private final RecepieListMapper recepieListMapper;
    private final CreateRecepieMapper createRecepieMapper;
    private final SimpleRecepieListMapper simpleRecepieListMapper;


    @Autowired
    public RecepieServiceImpl(RecepieRepository recepieRepository,
                              RecepieListMapper recepieListMapper,
                              CreateRecepieMapper createRecepieMapper,
                              SimpleRecepieListMapper simpleRecepieListMapper) {
        this.recepieRepository = recepieRepository;
        this.recepieListMapper = recepieListMapper;
        this.createRecepieMapper = createRecepieMapper;
        this.simpleRecepieListMapper = simpleRecepieListMapper;
    }


    @Override
    public List<RecepieDto> findAll() {
        List<Recepie> recepies = recepieRepository.findAll();
        return recepieListMapper.convert(recepies);
    }

    @Override
    public void save(CreateRecepieDto createRecepieDto){
        this.recepieRepository.save(createRecepieMapper.mapRecepieDtoToRecepie(createRecepieDto));
    }

    @Override
    public void deleteById(Long id) {
        recepieRepository.deleteById(id);
    }

    @Override
    public List<SimpleRecepieDto> getSimpleRecepies() {
        List<Recepie> recepies = recepieRepository.findAll();
        return simpleRecepieListMapper.convert(recepies);
    }

}
