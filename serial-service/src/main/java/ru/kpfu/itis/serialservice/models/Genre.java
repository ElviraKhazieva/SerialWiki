package ru.kpfu.itis.serialservice.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.kpfu.itis.serialservice.api.dto.GenreDto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.List;
import java.util.stream.Collectors;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Genre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String description;

    public static Genre from(GenreDto genreDto){
        return Genre.builder()
                .id(genreDto.getId())
                .name(genreDto.getName())
                .description("")
                .build();
    }
    public static List<Genre> from(List<GenreDto> genreDtos){
        return  genreDtos.stream().map(x->from(x)).collect(Collectors.toList());
    }

}
