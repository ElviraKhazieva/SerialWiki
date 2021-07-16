package ru.kpfu.itis.userservice.api.services;

import ru.kpfu.itis.userservice.api.dto.LoginForm;
import ru.kpfu.itis.userservice.api.dto.UserDto;
import ru.kpfu.itis.userservice.api.dto.UserSignUpForm;

public interface SecurityService {
    void registerUser(UserSignUpForm form);

    UserDto login(LoginForm form);

    UserDto login(String token);

    boolean authorize(Long userId, String requiredRole);
}
