package ru.kpfu.itis.serialservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.kpfu.itis.serialservice.models.Director;
import ru.kpfu.itis.serialservice.models.Genre;
import ru.kpfu.itis.serialservice.models.Review;
import ru.kpfu.itis.serialservice.models.Serial;

import java.sql.Date;
import java.util.List;
import java.util.Optional;

public interface SerialsRepository extends JpaRepository<Serial, Long> {

//    List<Serial> findAllByGenresIsContaining(List<Genre> genres);
//
//    List<Serial> findAllByGenresContains(List<Genre> genres);
//
//    List<Serial> findAllByGenres(List<Genre> genres);
//
//    List<Serial> findAllByDirectors(List<Director> directors);

    List<Serial> findAllByPopularity(Double value);

    List<Serial> findOrOrderByPopularity(Double popularity);

    Optional<Serial> findByName(String name);

    List<Serial> findAllByCreationAfter(Date creation);

    List<Serial> findSerialByNameContaining(String name);

    List<Serial> getAll();


}
