package pl.edu.pwsztar.service;

import pl.edu.pwsztar.domain.dto.RecepieProductsDto;

import java.util.List;

public interface RecepieProductsService {
    List<RecepieProductsDto> findAll();
    List<RecepieProductsDto> getProductsRequiredForRecepie(Long recepieId);
}
