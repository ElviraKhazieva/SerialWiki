package ru.kpfu.itis.serialservice.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Serial {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private Date creation;

    private String description;

    private Double popularity;

    private String imagePath;

    @ManyToMany
    private List<Genre> genres;

    @ManyToMany
    private List<Director> directors;

    @OneToMany
    private List<Review> reviews;
}
