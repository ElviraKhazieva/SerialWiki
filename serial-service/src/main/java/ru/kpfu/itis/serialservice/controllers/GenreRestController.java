package ru.kpfu.itis.serialservice.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import ru.kpfu.itis.serialservice.api.dto.DirectorDto;
import ru.kpfu.itis.serialservice.api.dto.DirectorForm;
import ru.kpfu.itis.serialservice.api.dto.GenreDto;
import ru.kpfu.itis.serialservice.api.dto.GenreForm;
import ru.kpfu.itis.serialservice.api.services.DirectorService;
import ru.kpfu.itis.serialservice.api.services.GenreService;

import java.util.List;

@RestController
public class GenreRestController {
    @Autowired
    private GenreService genreService;

    @GetMapping("/directors")
    public ResponseEntity<List<GenreDto>> getGenreList(){
        return ResponseEntity.ok(genreService.getAllGenre());
    }

    @PostMapping
    public ResponseEntity<?> addGenre(@RequestBody GenreForm genreForm){
        genreService.addGenre(genreForm.getName());
        return ResponseEntity.ok().build();
    }

}
