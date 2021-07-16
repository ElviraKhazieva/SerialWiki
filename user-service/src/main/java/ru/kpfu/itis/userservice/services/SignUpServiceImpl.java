package ru.kpfu.itis.userservice.services;

import com.netflix.discovery.converters.Auto;
import org.apache.http.client.CredentialsProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import ru.kpfu.itis.userservice.api.dto.UserSignUpForm;
import ru.kpfu.itis.userservice.api.services.SignUpService;
import ru.kpfu.itis.userservice.models.Credentials;
import ru.kpfu.itis.userservice.models.User;
import ru.kpfu.itis.userservice.repositories.CredentialsRepository;
import ru.kpfu.itis.userservice.repositories.UsersRepository;

import javax.xml.ws.Action;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class SignUpServiceImpl implements SignUpService {

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private UsersRepository usersRepository;

    @Override
    public User signUp(UserSignUpForm userForm) {
        List<Credentials> credentials = new ArrayList<>();
        credentials.add(Credentials.builder()
                .type(Credentials.Type.PASSWORD)
                .value(passwordEncoder.encode(userForm.getPassword()))
                .build());
        User newUser = User.builder()
                .nickname(userForm.getNickname())
                .email(userForm.getEmail())
                .credentials(credentials)
                .role(User.Role.CLIENT)
                .build();

        usersRepository.save(newUser);
        return newUser;
    }


}
