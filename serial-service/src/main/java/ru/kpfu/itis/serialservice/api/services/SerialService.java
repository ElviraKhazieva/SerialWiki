package ru.kpfu.itis.serialservice.api.services;

import ru.kpfu.itis.serialservice.api.dto.SerialDto;
import ru.kpfu.itis.serialservice.api.dto.SerialForm;

import java.util.List;
import java.util.Optional;

public interface SerialService {
    void addSerial(SerialForm serial);

    void updateSerial(SerialForm serial, Long id);

    void deleteSerial(Long id);

    Optional<SerialDto> getSerialById(Long id);

    List<SerialDto> getSerialsLike(String name);

    List<SerialDto> getSerialsByNew(int begin, int end);

    List<SerialDto> getSerialsByPopularity(int begin, int end);

    void updatePopularity(Long id, double popularity);
}
