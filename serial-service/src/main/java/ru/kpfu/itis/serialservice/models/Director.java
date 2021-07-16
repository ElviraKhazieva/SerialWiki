package ru.kpfu.itis.serialservice.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.kpfu.itis.serialservice.api.dto.DirectorDto;
import ru.kpfu.itis.serialservice.api.dto.GenreDto;

import javax.persistence.*;
import java.util.List;
import java.util.stream.Collectors;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Director {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String firstName;

    private String lastName;

    @ManyToMany(mappedBy = "directors")
    private List<Serial> serials;

    public static Director from(DirectorDto directorDto ){
        return Director.builder()
                .id(directorDto.getId())
                .firstName(directorDto.getFirstName())
                .lastName(directorDto.getLastName())
                .build();
    }
    public static List<Director> from(List<DirectorDto> directorDtos){
        return  directorDtos.stream().map(x->from(x)).collect(Collectors.toList());
    }
}
