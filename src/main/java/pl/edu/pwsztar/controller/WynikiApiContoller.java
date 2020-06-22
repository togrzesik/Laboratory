package pl.edu.pwsztar.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import pl.edu.pwsztar.domain.dto.CreateWynikiDto;
import pl.edu.pwsztar.domain.dto.WynikiDto;
import pl.edu.pwsztar.service.WynikiService;

import java.util.List;

@RestController
@RequestMapping(value="/api")
public class WynikiApiContoller {

    private static final Logger LOGGER = LoggerFactory.getLogger(PacjentApiController.class);
    private final WynikiService wynikiService;

    @Autowired
    public WynikiApiContoller(WynikiService wynikiService) {
        this.wynikiService = wynikiService;
    }

    @CrossOrigin
    @GetMapping(path = "/wyniki/{id_wynikow}", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<List<WynikiDto>> getResultDetails(@PathVariable Integer id_wynikow){
        LOGGER.info("searching required result:{}", id_wynikow);
        List<WynikiDto> wynikiDto = wynikiService.getResultDetails(id_wynikow);
        return new ResponseEntity<>(wynikiDto, HttpStatus.OK);
    }

    @CrossOrigin
    @GetMapping(path = "/wyniki", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<List<WynikiDto>> findAll(){
        LOGGER.info("searching all results");
        List<WynikiDto> wynikiDto = wynikiService.findAll();
        return new ResponseEntity<>(wynikiDto, HttpStatus.OK);
    }

    @CrossOrigin
    @PostMapping(path="/wyniki/create", consumes =  MediaType.APPLICATION_JSON_UTF8_VALUE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<?> createResults(@RequestBody CreateWynikiDto createWynikiDto){
        LOGGER.info("Creating new result");
        wynikiService.save(createWynikiDto);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
}
