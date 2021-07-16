package ru.kpfu.itis.userservice.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import ru.kpfu.itis.userservice.api.dto.UserDto;
import ru.kpfu.itis.userservice.api.services.UsersService;
import ru.kpfu.itis.userservice.models.User;
import ru.kpfu.itis.userservice.repositories.UsersRepository;

import java.util.Optional;

import static ru.kpfu.itis.userservice.api.dto.UserDto.from;

@Service
public class UsersServiceImpl implements UsersService {

    @Autowired
    private UsersRepository usersRepository;

    @Override
    public UserDto getUserByEmail(String email) {
        User user = usersRepository.findByEmail(email).orElseThrow(() -> new UsernameNotFoundException("User not found"));
        return from(user);
    }

    @Override
    public UserDto getUserById(Long id) {
        User user = usersRepository.findById(id).orElseThrow(() -> new UsernameNotFoundException("User not found"));
        return from(user);
    }

    @Override
    public void deleteUser(Long id) {
        User userForDelete = usersRepository.findById(id)
                .orElseThrow(IllegalArgumentException::new);
        userForDelete.setIsDeleted(true);
        usersRepository.save(userForDelete);
    }
}
