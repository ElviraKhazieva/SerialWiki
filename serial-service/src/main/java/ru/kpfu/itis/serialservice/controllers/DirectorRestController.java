package ru.kpfu.itis.serialservice.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import ru.kpfu.itis.serialservice.api.dto.DirectorDto;
import ru.kpfu.itis.serialservice.api.dto.DirectorForm;
import ru.kpfu.itis.serialservice.api.services.DirectorService;

import java.util.List;

@RestController
public class DirectorRestController {

    @Autowired
    private DirectorService directorService;

    @GetMapping("/serials/directors")
    public ResponseEntity<List<DirectorDto>> getDirectorList(){
        return ResponseEntity.ok(directorService.getAllDirector());
    }

    @PostMapping("/serials/directors")
    public ResponseEntity<?> addDirector(@RequestBody DirectorForm directorForm){
        directorService.addDirector(directorForm);
        return ResponseEntity.ok().build();
    }

}
