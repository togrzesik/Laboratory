package pl.edu.pwsztar.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import pl.edu.pwsztar.domain.dto.CreatePracownikDto;
import pl.edu.pwsztar.domain.dto.PracownikDto;
import pl.edu.pwsztar.service.PracownikService;

import java.util.List;

@RestController
@RequestMapping(value="/api")
public class PracownikApiController {
    private static final Logger LOGGER = LoggerFactory.getLogger(PracownikApiController.class);
    private final PracownikService pracownikService;


    @Autowired
    public PracownikApiController(PracownikService pracownikService) {
        this.pracownikService = pracownikService;
    }

    @CrossOrigin
    @GetMapping(value="/pracownik",produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<List<PracownikDto>> getRecepies(){
        LOGGER.info("find all workers");
        List<PracownikDto> pracownikDto = pracownikService.findAll();
        return new ResponseEntity<>(pracownikDto, HttpStatus.OK);
    }

    @CrossOrigin
    @GetMapping(value="/pracownik/{id_pracownika}", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<PracownikDto> getRecepieDetails(@PathVariable Integer id_pracownika){
        LOGGER.info("Fing worker details:{} ", id_pracownika);
        pracownikService.getRequiredWorkerDetails(id_pracownika);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @CrossOrigin
    @DeleteMapping(value="/pracownik/delete/{id_pracownika}", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<?> deleteWorker(@PathVariable Integer id_pracownika){
        LOGGER.info("Delete recepie");
        pracownikService.deleteById(id_pracownika);
        return new ResponseEntity<>(HttpStatus.OK);

    }

    @CrossOrigin
    @PostMapping(value="/pracownik/create",consumes = MediaType.APPLICATION_JSON_UTF8_VALUE ,produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<?> createWorker(@RequestBody CreatePracownikDto createPracownikDto){
        LOGGER.info("Create worker:{}", createPracownikDto);
        pracownikService.save(createPracownikDto);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

}
