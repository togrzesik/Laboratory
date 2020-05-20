package pl.edu.pwsztar.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import pl.edu.pwsztar.domain.dto.ProductDto;
import pl.edu.pwsztar.domain.dto.RecepieDto;
import pl.edu.pwsztar.service.RecepieService;

import java.util.List;

@Controller
@RequestMapping(value="/api")
public class RecepieApiController {
    private static final Logger LOGGER = LoggerFactory.getLogger(ProductApiController.class);

    private final RecepieService recepieService;

    @Autowired
    public RecepieApiController(RecepieService recepieService) {
        this.recepieService = recepieService;
    }

    @CrossOrigin
    @GetMapping(value="/recepies",produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<List<RecepieDto>> getRecepies(){
        LOGGER.info("find all recepies");
        List<RecepieDto> recepieDto = recepieService.findAll();
        return new ResponseEntity<>(recepieDto, HttpStatus.OK);
    }

    @CrossOrigin
    @DeleteMapping(value="/recepies/{id}", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<?> deleteRecepie(@PathVariable Long id){
        LOGGER.info("Delete recepie");
        recepieService.deleteById(id);
        return new ResponseEntity<>(HttpStatus.OK);

    }
}
