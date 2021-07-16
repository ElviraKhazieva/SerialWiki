package ru.kpfu.itis.userservice.api.services;

import ru.kpfu.itis.userservice.models.User;

import java.util.List;

public interface FavoritesAndToLookService {

    void addToFavorite(User user, Long serialId);

    void addToLook(User user, Long serialId);

    void deleteToFavorite(User user, Long serialId);

    void deleteToLook(User user, Long serialId);

    List<Long> getFavorite(User user);

    List<Long> getToLook(User user);

}
