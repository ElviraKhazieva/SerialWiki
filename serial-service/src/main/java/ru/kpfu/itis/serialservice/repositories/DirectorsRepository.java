package ru.kpfu.itis.serialservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.kpfu.itis.serialservice.models.Director;
import java.util.Optional;

public interface DirectorsRepository extends JpaRepository<Director, Long> {

    Optional<Director> findByFirstNameAndLastName(String firstName, String lastName);

}
