package ru.kpfu.itis.serialservice.api.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SerialDto {
    private Long id;
    private String serialName;
    private LocalDate creationDate;
    private String description;
    private double popularity;
    private List<DirectorDto> directors;
    private List<GenreDto> genres;
    private String previewImagePath;
}
