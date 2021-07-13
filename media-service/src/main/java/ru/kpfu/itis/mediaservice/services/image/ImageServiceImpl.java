package ru.kpfu.itis.mediaservice.services.image;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.kpfu.itis.mediaservice.Image;
import ru.kpfu.itis.mediaservice.utils.fileStorage.FileStorageService;

import javax.servlet.http.HttpServletResponse;

@Service
public class ImageServiceImpl implements ImageService {
    @Autowired
    FileStorageService fileStorageService;

    @Override
    public String saveImage(Image image) {
        return fileStorageService.saveFile(image.getFile());
    }

    @Override
    public Image getImage(String name, HttpServletResponse response) {
        return null;
    }
}
