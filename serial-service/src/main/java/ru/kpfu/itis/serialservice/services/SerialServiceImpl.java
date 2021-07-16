package ru.kpfu.itis.serialservice.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.kpfu.itis.serialservice.api.dto.SerialDto;
import ru.kpfu.itis.serialservice.api.dto.SerialForm;
import ru.kpfu.itis.serialservice.api.services.SerialService;
import ru.kpfu.itis.serialservice.models.Serial;
import ru.kpfu.itis.serialservice.repositories.SerialsRepository;

import java.util.List;
import java.util.Optional;

@Service
public class SerialServiceImpl implements SerialService {
    @Autowired
    SerialsRepository serialsRepository;

    @Override
    public void addSerial(SerialForm serial) {
        serialsRepository.save(Serial.from(serial));


    }

    @Override
    public void updateSerial(SerialForm serial) {

    }

    @Override
    public void deleteSerial(Long id) {
        serialsRepository.deleteById(id);

    }

    @Override
    public Optional<SerialDto> getSerialById(Long id) {
        return Optional.empty();
    }

    @Override
    public List<SerialDto> getSerialsLike(String name) {
        return null;
    }

    @Override
    public List<SerialDto> getSerialsByNew(int begin, int end) {
        return null;
    }

    @Override
    public List<SerialDto> getSerialsByPopularity(int begin, int end) {
        return null;
    }

    @Override
    public void updatePopularity(Long id, double popularity) {

    }
}
