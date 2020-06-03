package pl.edu.pwsztar.domain.mapper;

import org.springframework.stereotype.Component;
import pl.edu.pwsztar.domain.converter.Converter;
import pl.edu.pwsztar.domain.dto.ProductDto;
import pl.edu.pwsztar.domain.entity.Product;

@Component
public class ProductMapper implements Converter<Product, ProductDto> {
    @Override
    public ProductDto convert(Product from) {
        return new ProductDto.Builder()
                .productId(from.getProductId())
                .name(from.getName())
                .barcode(from.getBarcode())
                .amount(from.getAmount())
                .unit(from.getUnit())
                .build();
    }
}