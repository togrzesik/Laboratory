package pl.edu.pwsztar.service.serviceImpl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.edu.pwsztar.domain.dto.*;
import pl.edu.pwsztar.domain.mapper.CreateWynikiMapper;
import pl.edu.pwsztar.domain.mapper.WynikiListMapper;
import pl.edu.pwsztar.domain.repository.WynikiRepository;
import pl.edu.pwsztar.service.WynikiService;

import java.util.List;

@Service
public class WynikiServiceImpl implements WynikiService {

    private static final Logger LOGGER = LoggerFactory.getLogger(WynikiServiceImpl.class);

    private final WynikiRepository wynikiRepository;
    private final CreateWynikiMapper createWynikiMapper;
    private final WynikiListMapper wynikiListMapper;


    @Autowired
    public WynikiServiceImpl(WynikiRepository wynikiRepository,
                             CreateWynikiMapper createWynikiMapper,
                             WynikiListMapper wynikiListMapper) {
        this.wynikiRepository = wynikiRepository;
        this.createWynikiMapper = createWynikiMapper;
        this.wynikiListMapper = wynikiListMapper;
    }


    @Override
    public List<WynikiDto> findAll() {
        return wynikiListMapper.convert(wynikiRepository.findAll());
    }


    @Override
    public List<WynikiDto> getResultDetails(Integer id_wynikow) {
        return wynikiListMapper.convert(wynikiRepository.getResultDetails(id_wynikow));
    }

    @Override
    public void save(CreateWynikiDto createWynikiDto) {
        this.wynikiRepository.save(createWynikiMapper.mapWynikiDtoToWyniki(createWynikiDto));
    }

}
