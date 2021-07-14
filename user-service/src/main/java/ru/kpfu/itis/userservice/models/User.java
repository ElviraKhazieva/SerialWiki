package ru.kpfu.itis.userservice.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Table;
import org.springframework.data.domain.PageRequest;

import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity(name = "account")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nickname;

    private String email;

    private Role role;

    public enum Role {
        ADMIN, CLIENT
    }

    @OneToMany
    private List<Favorites> favorites;

    @OneToMany
    private List<ToLookList> toLookList;

    @OneToMany
    private List<Credentials> credentials;
}
