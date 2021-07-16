package ru.kpfu.itis.userservice.services;

import org.springframework.stereotype.Service;
import ru.kpfu.itis.userservice.api.dto.LoginForm;
import ru.kpfu.itis.userservice.api.services.LoginService;

@Service
public class LoginServiceImpl implements LoginService {
    @Override
    public boolean login(LoginForm emailPassword) {
        return false;
    }
}
