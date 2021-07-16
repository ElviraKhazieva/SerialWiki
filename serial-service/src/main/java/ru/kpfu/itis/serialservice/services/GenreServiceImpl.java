package ru.kpfu.itis.serialservice.services;

import org.springframework.stereotype.Service;
import ru.kpfu.itis.serialservice.api.dto.GenreDto;
import ru.kpfu.itis.serialservice.api.services.GenreService;
import ru.kpfu.itis.serialservice.models.Genre;

import java.util.Arrays;
import java.util.List;

@Service
public class GenreServiceImpl implements GenreService {

    @Override
    public void addGenre(String genreName) {

    }

    @Override
    public List<GenreDto> getAllGenre() {
        //todo replace with from
        return Arrays.asList(GenreDto.builder().
                id(1L).
                description("blabla")
                .name("fir").build(),
                GenreDto.builder().
                        id(2L).
                        description("22blabla")
                        .name("sec").build());
    }
}
