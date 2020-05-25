package pl.edu.pwsztar.domain.mapper;

import org.springframework.stereotype.Component;
import pl.edu.pwsztar.domain.dto.CreateProductDto;
import pl.edu.pwsztar.domain.entity.Product;

@Component
public class CreateProductMapper {

    public Product createProductDtoToProduct(CreateProductDto createProductDto) {

        Product product = new Product();

        product.setName(createProductDto.getName());
        product.setBarcode(createProductDto.getBarcode());
        product.setAmount(createProductDto.getAmount());
        product.setUnit(createProductDto.getUnit());

        return product;
    }
}