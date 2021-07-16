package ru.kpfu.itis.userservice.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import ru.kpfu.itis.userservice.api.dto.UserSignUpForm;
import ru.kpfu.itis.userservice.api.services.SignUpService;
import ru.kpfu.itis.userservice.api.services.UsersService;

import javax.servlet.http.HttpServletResponse;

@RestController
public class SignUpController {

    @Autowired
    private SignUpService service;

    @PostMapping("/signUp")
    public void signUp(@RequestBody UserSignUpForm user, HttpServletResponse response) {
        service.signUp(user);
        response.setStatus(200);
    }


}
