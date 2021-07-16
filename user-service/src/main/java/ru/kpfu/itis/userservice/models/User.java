package ru.kpfu.itis.userservice.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Table;
import org.springframework.data.domain.PageRequest;

import javax.persistence.*;
import javax.persistence.criteria.CriteriaBuilder;
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

    @ElementCollection
    @CollectionTable(name = "favorites", joinColumns = @JoinColumn(name = "user_id", referencedColumnName = "id"))
    @Column(name = "serial_id")
    private List<Integer> favorites;

    @ElementCollection
    @CollectionTable(name = "to_look", joinColumns = @JoinColumn(name = "user_id", referencedColumnName = "id"))
    @Column(name = "serial_id")
    private List<Integer> toLook;

    @OneToMany
    private List<Credentials> credentials;


}
