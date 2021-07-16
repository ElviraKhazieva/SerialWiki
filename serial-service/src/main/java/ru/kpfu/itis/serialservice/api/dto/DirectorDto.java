package ru.kpfu.itis.serialservice.api.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.kpfu.itis.serialservice.models.Director;
import ru.kpfu.itis.serialservice.models.Serial;

import java.util.List;
import java.util.stream.Collectors;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DirectorDto {

    private Long id;

    private String firstName;

    private String lastName;

    public static DirectorDto from(Director director){
        return DirectorDto.builder()
                .id(director.getId())
                .firstName(director.getFirstName())
                .lastName(director.getLastName())
                .build();
    }

    public static List<DirectorDto> from(List<Director> directors){
        return directors.stream()
                .map(DirectorDto::from)
                .collect(Collectors.toList());
    }
}
