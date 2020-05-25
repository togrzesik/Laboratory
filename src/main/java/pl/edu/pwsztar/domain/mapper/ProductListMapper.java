package pl.edu.pwsztar.domain.mapper;

import org.springframework.stereotype.Component;
import pl.edu.pwsztar.domain.converter.Converter;
import pl.edu.pwsztar.domain.dto.ProductDto;
import pl.edu.pwsztar.domain.entity.Product;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class ProductListMapper implements Converter<List<Product>, List<ProductDto>> {
    @Override
    public List<ProductDto> convert(List<Product> from) {

        return from.stream()
                .map(product -> new ProductDto.Builder()
                        .productId(product.getProductId())
                        .name(product.getName())
                        .barcode(product.getBarcode())
                        .amount(product.getAmount())
                        .unit(product.getUnit())
                        .build()
                )
                .collect(Collectors.toList());
    }
}
