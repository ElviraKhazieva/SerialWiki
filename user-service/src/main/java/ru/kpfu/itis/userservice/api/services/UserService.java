package ru.kpfu.itis.userservice.api.services;

import ru.kpfu.itis.userservice.api.dto.UserDto;
import ru.kpfu.itis.userservice.api.dto.UserForm;

import java.util.List;
import java.util.Optional;

public interface UserService {
    void addUser(UserForm userForm);

    Optional<UserDto> getUserByEmail(String email);

    Optional<UserDto> getUserById(Long id);

    void deleteUser(Long id);
}
