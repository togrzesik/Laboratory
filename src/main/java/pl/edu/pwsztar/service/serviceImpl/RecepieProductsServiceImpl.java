package pl.edu.pwsztar.service.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.edu.pwsztar.domain.dto.CreateRecepieProductsDto;
import pl.edu.pwsztar.domain.dto.RecepieProductsDto;
import pl.edu.pwsztar.domain.mapper.CreateRecepieProductsMapper;
import pl.edu.pwsztar.domain.mapper.RecepieProductsListMapper;
import pl.edu.pwsztar.domain.repository.RecepieProductsRepository;
import pl.edu.pwsztar.service.RecepieProductsService;

import java.util.List;

@Service
public class RecepieProductsServiceImpl implements RecepieProductsService {

    private final RecepieProductsRepository recepieProductsRepository;
    private final RecepieProductsListMapper recepieProductsListMapper;
    private final CreateRecepieProductsMapper createRecepieProductsMapper;

    @Autowired
    public RecepieProductsServiceImpl(RecepieProductsRepository recepieProductsRepository,
                                      RecepieProductsListMapper recepieProductsListMapper,
                                      CreateRecepieProductsMapper createRecepieProductsMapper) {
        this.recepieProductsRepository = recepieProductsRepository;
        this.recepieProductsListMapper = recepieProductsListMapper;
        this.createRecepieProductsMapper = createRecepieProductsMapper;
    }

    @Override
    public List<RecepieProductsDto> findAll() {
        return recepieProductsListMapper.convert(recepieProductsRepository.findAll());
    }


    @Override
    public List<RecepieProductsDto> getProductsRequiredForRecepie(Long recepieId) {
        return recepieProductsListMapper.convert(recepieProductsRepository.getProductsRequiredForRecepie(recepieId));
    }

    @Override
    public void save(CreateRecepieProductsDto createRecepieProductsDto) {
        this.recepieProductsRepository.save(createRecepieProductsMapper.mapRecepieProductsDtoToRecepieProducts(createRecepieProductsDto));
    }
}
