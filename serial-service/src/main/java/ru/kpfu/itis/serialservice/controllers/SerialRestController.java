package ru.kpfu.itis.serialservice.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.kpfu.itis.serialservice.api.dto.SerialDto;
import ru.kpfu.itis.serialservice.api.dto.SerialForm;
import ru.kpfu.itis.serialservice.api.services.DirectorService;
import ru.kpfu.itis.serialservice.api.services.GenreService;
import ru.kpfu.itis.serialservice.api.services.SerialService;

import java.util.Optional;

@RestController
public class SerialRestController {
    @Autowired
    private DirectorService directorService;
    @Autowired
    private GenreService genreService;
    @Autowired
    private SerialService serialService;

    @GetMapping("/serial/{id}")
    public ResponseEntity<SerialDto> getSerial(@PathVariable("id") Long id){
        Optional<SerialDto> optional = serialService.getSerialById(id);
        return optional.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping("/serial")
    public ResponseEntity<?> addSerial(@RequestBody SerialForm serialForm){
        serialService.addSerial(serialForm);
        return ResponseEntity.ok().build();
    }

    @PutMapping("/serial/{id}")
    public ResponseEntity<?> updateSerial(@RequestBody SerialForm serialForm, @PathVariable Long id){
        serialService.updateSerial(serialForm);
        return ResponseEntity.ok().build();
    }
}
