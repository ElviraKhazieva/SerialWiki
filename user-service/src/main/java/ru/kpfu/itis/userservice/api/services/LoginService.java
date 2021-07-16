package ru.kpfu.itis.userservice.api.services;

import ru.kpfu.itis.userservice.api.dto.LoginForm;
import ru.kpfu.itis.userservice.models.User;

public interface LoginService {

    boolean login(LoginForm emailPassword);

}
