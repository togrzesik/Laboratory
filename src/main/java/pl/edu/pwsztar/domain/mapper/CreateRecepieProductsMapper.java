package pl.edu.pwsztar.domain.mapper;


import org.springframework.stereotype.Component;
import pl.edu.pwsztar.domain.dto.CreateRecepieProductsDto;
import pl.edu.pwsztar.domain.entity.RecepieProducts;

@Component
public class CreateRecepieProductsMapper {

    public RecepieProducts mapRecepieProductsDtoToRecepieProducts(CreateRecepieProductsDto createRecepieProductsDto) {

        RecepieProducts recepieProducts = new RecepieProducts();

        recepieProducts.setRecepieId(createRecepieProductsDto.getRecepieId());
        recepieProducts.setProductId(createRecepieProductsDto.getProductId());
        recepieProducts.setAmount(createRecepieProductsDto.getAmount());

        return recepieProducts;
    }
}
