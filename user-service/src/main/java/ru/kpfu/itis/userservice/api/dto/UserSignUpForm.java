package ru.kpfu.itis.userservice.api.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Email;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserSignUpForm {

    @Email
    private String email;

    private String nickname;

    private String password;

    private String passwordRepeat;

}
