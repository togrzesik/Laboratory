package pl.edu.pwsztar.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import pl.edu.pwsztar.domain.dto.CreateProductDto;
import pl.edu.pwsztar.domain.dto.ProductDto;
import pl.edu.pwsztar.service.ProductService;

import java.util.List;

@Controller
@RequestMapping(value="/api")
public class ProductApiController {

    private static final Logger LOGGER = LoggerFactory.getLogger(ProductApiController.class);

    private final ProductService productService;

    @Autowired
    public ProductApiController(ProductService productService) {
        this.productService = productService;
    }

    @CrossOrigin
    @GetMapping(value = "/products", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<List<ProductDto>> getProducts() {
        LOGGER.info("find all products");

        List<ProductDto> productDto = productService.findAll();
        return new ResponseEntity<>(productDto, HttpStatus.OK);
    }

    @CrossOrigin
    @PostMapping(value = "/products", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<?> addProduct(@RequestBody CreateProductDto createProductDto) {
        LOGGER.info("create product: {}", createProductDto);
        productService.save(createProductDto);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @CrossOrigin
    @DeleteMapping(value = "/products/{id}", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<?> deleteProduct(@PathVariable Long id) {
        LOGGER.info("delete product: {}", id);

        productService.deleteById(id);
        return  new ResponseEntity<>(HttpStatus.OK);
    }
}
