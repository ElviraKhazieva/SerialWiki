package ru.kpfu.itis.serialservice.api.services;

import ru.kpfu.itis.serialservice.api.dto.DirectorDto;
import ru.kpfu.itis.serialservice.api.dto.DirectorForm;

import java.util.Optional;

public interface DirectorService {
    void addDirector(DirectorForm form);

    Optional<DirectorDto> getDirectorById(Long id);
}
