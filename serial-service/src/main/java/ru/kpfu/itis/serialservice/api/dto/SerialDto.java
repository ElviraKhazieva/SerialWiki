package ru.kpfu.itis.serialservice.api.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.kpfu.itis.serialservice.models.Serial;

import java.sql.Date;
import java.time.LocalDate;

import java.util.List;
import java.util.stream.Collectors;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SerialDto {
    private Long id;
    private String serialName;
    private Date creationDate;
    private String description;
    private double popularity;
    private List<DirectorDto> directors;
    private List<GenreDto> genres;
    private String previewImagePath;

    public static SerialDto from(Serial serial){
        return SerialDto.builder()
                .id(serial.getId())
                .serialName(serial.getName())
                .creationDate(serial.getCreation().toLocalDate())
                .description(serial.getDescription())
                .popularity(serial.getPopularity())
                .previewImagePath(serial.getImagePath())
                .build();
    }

    public static List<SerialDto> from(List<Serial> serials){
        return serials.stream().map(SerialDto::from).collect(Collectors.toList());
    }
}
