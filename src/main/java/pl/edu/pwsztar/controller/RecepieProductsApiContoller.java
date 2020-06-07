package pl.edu.pwsztar.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import pl.edu.pwsztar.domain.dto.CreateRecepieProductsDto;
import pl.edu.pwsztar.domain.dto.RecepieProductsDto;
import pl.edu.pwsztar.service.RecepieProductsService;

import java.util.List;

@Controller
@RequestMapping(value="/api")
public class RecepieProductsApiContoller {

    private static final Logger LOGGER = LoggerFactory.getLogger(ProductApiController.class);
    private final RecepieProductsService recepieProductsService;

    @Autowired
    public RecepieProductsApiContoller(RecepieProductsService recepieProductsService) {
        this.recepieProductsService = recepieProductsService;
    }

    @CrossOrigin
    @GetMapping(path = "/recepieProducts/{recepieId}", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<List<RecepieProductsDto>> getProductsForRecepie(@PathVariable Long recepieId){
        LOGGER.info("searching products for recepie:{}",recepieId);
        List<RecepieProductsDto> recepieProductsDto = recepieProductsService.getProductsRequiredForRecepie(recepieId);
        return new ResponseEntity<>(recepieProductsDto, HttpStatus.OK);
    }

    @CrossOrigin
    @GetMapping(path = "/recepieProducts", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<List<RecepieProductsDto>> findAll(){
        LOGGER.info("searching products reqiured for all recepies ");
        List<RecepieProductsDto> recepieProductsDto = recepieProductsService.findAll();
        return new ResponseEntity<>(recepieProductsDto, HttpStatus.OK);
    }

    @CrossOrigin
    @PostMapping(path="/recepieProducts/create", consumes =  MediaType.APPLICATION_JSON_UTF8_VALUE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<?> createRecepieProducts(@RequestBody CreateRecepieProductsDto createRecepieProductsDto){
        LOGGER.info("Creatnig new Recepie Product");
        recepieProductsService.save(createRecepieProductsDto);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
}
