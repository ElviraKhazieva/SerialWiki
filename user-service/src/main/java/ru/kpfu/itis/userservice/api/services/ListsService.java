package ru.kpfu.itis.userservice.api.services;

import java.util.List;

public interface ListsService {
    void addToFavorite(Long userId, Long serialId);

    void addToLook(Long userId, Long serialId);

    void deleteToFavorite(Long userId, Long serialId);

    void deleteToLook(Long userId, Long serialId);

    List<Long> getFavorite(Long userId);

    List<Long> getLook(Long userId);
}
