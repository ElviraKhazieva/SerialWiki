package ru.kpfu.itis.userservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.kpfu.itis.userservice.models.User;

import java.util.List;
import java.util.Optional;

public interface UsersRepository extends JpaRepository<User, Long> {

    Optional<User> findByEmail(String email);

    Optional<User> findByNickname(String nickname);

    List<User> findAllByFavoritesContaining(List<Integer> favorites);

    List<User> findAllByFavoritesContains(List<Integer> favorites);

    List<User> findAllByFavorites(List<Integer> favorites);

    List<User> findAllByToLook(List<Integer> toLook);

    List<User> findAllByToLookContaining(List<Integer> toLook);

    List<User> findAllByToLookContains(List<Integer> toLook);

}
