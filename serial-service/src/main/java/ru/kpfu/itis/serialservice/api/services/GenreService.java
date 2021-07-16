package ru.kpfu.itis.serialservice.api.services;

import ru.kpfu.itis.serialservice.api.dto.GenreDto;

import java.util.List;

public interface GenreService {
    void addGenre(String genreName);

    List<GenreDto> getAllGenre();
}
