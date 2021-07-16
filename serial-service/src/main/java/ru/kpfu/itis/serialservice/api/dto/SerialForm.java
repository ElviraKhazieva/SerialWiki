package ru.kpfu.itis.serialservice.api.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.sql.Date;
import java.util.List;

@Getter
@Setter
@Builder
public class SerialForm {
    private String serialName;
    private Date creationDate;
    private String description;
    private List<DirectorDto> directors;
    private List<GenreDto> genres;
    private String previewImagePath;
}
