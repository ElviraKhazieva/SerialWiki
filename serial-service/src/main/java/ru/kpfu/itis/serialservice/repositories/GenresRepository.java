package ru.kpfu.itis.serialservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.kpfu.itis.serialservice.models.Genre;

public interface GenresRepository extends JpaRepository<Genre, Long> {
}
