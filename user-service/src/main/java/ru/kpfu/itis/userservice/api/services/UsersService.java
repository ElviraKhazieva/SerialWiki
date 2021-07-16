package ru.kpfu.itis.userservice.api.services;

import ru.kpfu.itis.userservice.api.dto.UserDto;
import ru.kpfu.itis.userservice.api.dto.UserSignUpForm;

import java.util.Optional;

public interface UsersService {

    UserDto getUserByEmail(String email);

    UserDto getUserById(Long id);

    void deleteUser(Long id);

}
