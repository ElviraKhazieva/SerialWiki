package ru.kpfu.itis.serialservice.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.kpfu.itis.serialservice.api.dto.GenreDto;
import ru.kpfu.itis.serialservice.api.services.GenreService;
import ru.kpfu.itis.serialservice.models.Genre;
import ru.kpfu.itis.serialservice.repositories.GenresRepository;

import java.util.Arrays;
import java.util.List;

@Service
public class GenreServiceImpl implements GenreService {

    @Autowired
    GenresRepository genresRepository;

    @Override
    public void addGenre(String genreName) {
        genresRepository.save(Genre.builder().name(genreName).build());

    }

    @Override
    public List<GenreDto> getAllGenre() {
        return null;
    }
}
