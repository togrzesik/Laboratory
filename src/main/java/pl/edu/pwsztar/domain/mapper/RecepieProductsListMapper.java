package pl.edu.pwsztar.domain.mapper;

import org.springframework.stereotype.Component;
import pl.edu.pwsztar.domain.converter.Converter;
import pl.edu.pwsztar.domain.dto.RecepieProductsDto;
import pl.edu.pwsztar.domain.entity.RecepieProducts;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class RecepieProductsListMapper implements Converter<List<RecepieProducts>,List<RecepieProductsDto>> {

    @Override
    public List<RecepieProductsDto> convert(List<RecepieProducts> from) {
        return from.stream().map(recepieProducts -> new RecepieProductsDto.Builder()
                .recepieId(recepieProducts.getRecepieId())
                .productId(recepieProducts.getProductId())
                .amount(recepieProducts.getAmount())
                .build()
        ).collect(Collectors.toList());
    }
}
