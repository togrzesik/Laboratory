package pl.edu.pwsztar.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import pl.edu.pwsztar.domain.dto.CreatePacjentDto;
import pl.edu.pwsztar.domain.dto.PacjentDto;
import pl.edu.pwsztar.service.PacjentService;

import java.util.List;

@RestController
@RequestMapping(value="/api")
public class PacjentApiController {

    private static final Logger LOGGER = LoggerFactory.getLogger(PacjentApiController.class);

    private final PacjentService pacjentService;

    @Autowired
    public PacjentApiController(PacjentService productService) {
        this.pacjentService = productService;
    }

    @CrossOrigin
    @GetMapping(value = "/pacjent", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<List<PacjentDto>> getClients() {
        LOGGER.info("find all clients");

        List<PacjentDto> pacjentDto = pacjentService.findAll();
        return new ResponseEntity<>(pacjentDto, HttpStatus.OK);
    }

    @CrossOrigin
    @GetMapping(value="/pacjent/{id_pacjenta}", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<PacjentDto> getClientDetails(@PathVariable Integer id_pacjenta){
        LOGGER.info("Getting single client details");
        pacjentService.getRequiredClientDetails(id_pacjenta);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @CrossOrigin
    @PostMapping(value = "/pacjent/create",consumes = MediaType.APPLICATION_JSON_UTF8_VALUE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<?> addClient(@RequestBody CreatePacjentDto createPacjentDto) {
        LOGGER.info("create product: {}", createPacjentDto);
        pacjentService.save(createPacjentDto);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @CrossOrigin
    @DeleteMapping(value = "/pacjent/delete/{id_pacjenta}", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<?> deleteClient(@PathVariable Integer id_pacjenta) {
        LOGGER.info("delete product: {}", id_pacjenta);

        pacjentService.deleteById(id_pacjenta);
        return  new ResponseEntity<>(HttpStatus.OK);
    }
}
