package pl.edu.pwsztar.service.serviceImpl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.edu.pwsztar.domain.dto.CreateProductDto;
import pl.edu.pwsztar.domain.dto.ProductDto;
import pl.edu.pwsztar.domain.entity.Product;
import pl.edu.pwsztar.domain.mapper.CreateProductMapper;
import pl.edu.pwsztar.domain.mapper.ProductListMapper;
import pl.edu.pwsztar.domain.repository.ProductRepository;
import pl.edu.pwsztar.service.ProductService;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    private static final Logger LOGGER = LoggerFactory.getLogger(ProductServiceImpl.class);

    private final ProductRepository productRepository;
    private final ProductListMapper productListMapper;
    private final CreateProductMapper createProductMapper;

    @Autowired
    public ProductServiceImpl(ProductRepository productRepository,
                              ProductListMapper productListMapper,
                              CreateProductMapper createProductMapper) {

        this.productRepository = productRepository;
        this.productListMapper = productListMapper;
        this.createProductMapper = createProductMapper;
    }

    @Override
    public List<ProductDto> findAll() {
        List<Product> products = productRepository.findAll();
        return productListMapper.convert(products);
    }

    @Override
    public void save(CreateProductDto createProductDto) {
        productRepository.save(createProductMapper.createProductDtoToProduct(createProductDto));
    }

    @Override
    public void deleteById(Long id){
        productRepository.deleteById(id);
    }

}
