package ru.kpfu.itis.userservice.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.domain.PageRequest;

import javax.persistence.*;
import java.lang.reflect.Type;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Credentials {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private User user;

    private String value;

    private Type type;

    public enum Type {
        PASSWORD, TOKEN
    }

}
