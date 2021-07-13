package ru.kpfu.itis.mediaservice.utils.fileStorage;

import org.springframework.core.io.Resource;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.nio.file.Path;

@Component
public interface FileStorageService {
    String saveFile(MultipartFile file);


}
