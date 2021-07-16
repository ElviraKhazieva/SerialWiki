package ru.kpfu.itis.serialservice.services;

import org.springframework.stereotype.Service;
import ru.kpfu.itis.serialservice.api.dto.DirectorDto;
import ru.kpfu.itis.serialservice.api.dto.DirectorForm;
import ru.kpfu.itis.serialservice.api.dto.GenreDto;
import ru.kpfu.itis.serialservice.api.services.DirectorService;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class DirectorServiceImpl implements DirectorService {
    @Override
    public void addDirector(DirectorForm form) {

    }

    @Override
    public Optional<DirectorDto> getDirectorById(Long id) {
        return Optional.empty();
    }

    @Override
    public List<DirectorDto> getAllDirector() {
        return Arrays.asList(DirectorDto.builder().
                id(1L)
                .name("dir_fir").build(),
                DirectorDto.builder().
                        id(2L)
                        .name("dirsec").build());
    }
}
