package ru.kpfu.itis.serialservice.api.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.kpfu.itis.serialservice.models.Genre;
import ru.kpfu.itis.serialservice.models.Serial;

import java.util.List;
import java.util.stream.Collectors;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class GenreDto {

    private Long id;

    private String name;

    public static GenreDto from(Genre genre) {
        return GenreDto.builder()
                .id(genre.getId())
                .name(genre.getName())
                .build();
    }

    public static List<GenreDto> from(List<Genre> genres) {
        return genres.stream().map(GenreDto::from).collect(Collectors.toList());
    }

}
