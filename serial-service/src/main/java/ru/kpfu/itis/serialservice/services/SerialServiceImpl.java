package ru.kpfu.itis.serialservice.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.kpfu.itis.serialservice.api.dto.SerialDto;
import ru.kpfu.itis.serialservice.api.dto.SerialForm;
import ru.kpfu.itis.serialservice.api.services.SerialService;
import ru.kpfu.itis.serialservice.models.Director;
import ru.kpfu.itis.serialservice.models.Genre;
import ru.kpfu.itis.serialservice.models.Serial;
import ru.kpfu.itis.serialservice.repositories.DirectorsRepository;
import ru.kpfu.itis.serialservice.repositories.GenresRepository;
import ru.kpfu.itis.serialservice.repositories.SerialsRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@Service
public class SerialServiceImpl implements SerialService {
    @Autowired
    private SerialsRepository serialsRepository;

    @Autowired
    private DirectorsRepository directorsRepository;

    @Autowired
    private GenresRepository genresRepository;

    @Override
    public void addSerial(SerialForm serial) {
        Serial newSerial = Serial.from(serial);
        List<Director> directorList = new ArrayList<>();
        for(Long id : serial.getDirectorIds()){
            directorList.add(directorsRepository.getById(id));
        }
        newSerial.setDirectors(directorList);
        List<Genre> genresList = new ArrayList<>();
        for(Long id : serial.getGenreIds()){
            genresList.add(genresRepository.getById(id));
        }
        newSerial.setGenres(genresList);
        serialsRepository.save(newSerial);
    }

    @Override

    public void updateSerial(SerialForm serial, Long id) {
        serialsRepository.save(Serial.from(serial));
    }



    @Override
    public void deleteSerial(Long id) {
        serialsRepository.deleteById(id);

    }

    @Override
    public SerialDto getSerialById(Long id) {
        Serial serial = serialsRepository.findById(id).orElseThrow(()->new NoSuchElementException("no serial"));
        return SerialDto.from(serial);
    }

    @Override
    public List<SerialDto> getSerialsLike(String name) {
        return SerialDto.from(serialsRepository.findSerialByNameContaining(name));
    }

    @Override
    public List<SerialDto> getSerialsByNew(int begin, int end) {
        if(begin <= end) {
            return SerialDto.from(serialsRepository.getAllByCreation());
        }
        throw new IllegalArgumentException("begin > end");
    }

    @Override
    public List<SerialDto> getSerialsByPopularity(int begin, int end) {
        if(begin <= end) {
            return SerialDto.from(serialsRepository.getAllByPopularity());
        }
        throw new IllegalArgumentException("begin > end");
    }

    @Override
    public void updatePopularity(Long id, double popularity) {

    }
}
