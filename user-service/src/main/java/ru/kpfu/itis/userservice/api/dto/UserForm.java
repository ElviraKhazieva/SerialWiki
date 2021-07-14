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
public class UserForm {
    private String nickname;
    @Email
    private String email;
    private String password;
    private String passwordRepeat;
}
