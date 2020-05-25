package pl.edu.pwsztar.service;

import pl.edu.pwsztar.domain.dto.CreateProductDto;
import pl.edu.pwsztar.domain.dto.ProductDto;
import pl.edu.pwsztar.domain.entity.Product;

import java.util.List;

public interface ProductService {

    List<ProductDto> findAll();
    void save(CreateProductDto createProductDto);
    void deleteById(Long id);
}
