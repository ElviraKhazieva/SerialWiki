package ru.kpfu.itis.userservice.api.services;

import ru.kpfu.itis.userservice.api.dto.UserSignUpForm;
import ru.kpfu.itis.userservice.models.User;

public interface SignUpService {

    User signUp(UserSignUpForm userForm);

}
