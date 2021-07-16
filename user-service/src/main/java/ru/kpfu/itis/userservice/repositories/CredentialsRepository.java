package ru.kpfu.itis.userservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.kpfu.itis.userservice.models.Credentials;
import ru.kpfu.itis.userservice.models.User;

import java.util.Optional;

public interface CredentialsRepository extends JpaRepository<Credentials, Long> {
    Optional<Credentials> getCredentialsByUser(User user);
}
