package ru.kpfu.itis.userservice.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.kpfu.itis.userservice.api.services.FavoritesAndToLookService;
import ru.kpfu.itis.userservice.models.User;
import ru.kpfu.itis.userservice.repositories.UsersRepository;

import java.util.List;

@Service
public class FavoritesAndToLookServiceImpl implements FavoritesAndToLookService {

    @Autowired
    private UsersRepository usersRepository;

    @Override
    public void addToFavorite(User user, Long serialId) {
        user.getFavorites().add(serialId);
        usersRepository.save(user);
    }

    @Override
    public void addToLook(User user, Long serialId) {
        user.getToLook().add(serialId);
        usersRepository.save(user);
    }

    @Override
    public void deleteToFavorite(User user, Long serialId) {
        user.getFavorites().remove(serialId);
        usersRepository.save(user);
    }

    @Override
    public void deleteToLook(User user, Long serialId) {
        user.getToLook().remove(serialId);
        usersRepository.save(user);
    }

    @Override
    public List<Long> getFavorite(User user) {
        return user.getFavorites();
    }

    @Override
    public List<Long> getToLook(User user) {
        return user.getToLook();
    }
}
