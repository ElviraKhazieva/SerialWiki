package ru.kpfu.itis.mediaservice;

import lombok.*;
import org.springframework.web.multipart.MultipartFile;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class Image {
    private MultipartFile file;


}
