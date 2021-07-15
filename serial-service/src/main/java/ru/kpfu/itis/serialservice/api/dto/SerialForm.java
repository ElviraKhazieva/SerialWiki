package ru.kpfu.itis.serialservice.api.dto;

import java.time.LocalDate;
import java.util.List;

public class SerialForm {
    private String serialName;
    private LocalDate creationDate;
    private String description;
    private List<DirectorDto> directors;
    private List<GenreDto> genres;
    private String previewImagePath;
}
