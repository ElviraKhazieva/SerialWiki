package ru.kpfu.itis.mediaservice.services.image;

import ru.kpfu.itis.mediaservice.Image;

import javax.servlet.http.HttpServletResponse;

public interface ImageService {
    public String saveImage (Image image);
    public Image getImage(String name, HttpServletResponse response);
}
