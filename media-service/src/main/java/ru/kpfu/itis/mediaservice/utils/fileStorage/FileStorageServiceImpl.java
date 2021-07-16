package ru.kpfu.itis.mediaservice.utils.fileStorage;

import org.apache.tomcat.util.http.fileupload.IOUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;


import javax.servlet.http.HttpServletResponse;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.UUID;

@Component
public class FileStorageServiceImpl implements FileStorageService {


    @Value("${storage.path}")
    private String storagePath;

    @Override
    public String saveFile(MultipartFile uploadingFile) {

        String storageName = UUID.randomUUID().toString()+ uploadingFile.getOriginalFilename();


        try {
            Files.copy(uploadingFile.getInputStream(), Paths.get(storagePath, storageName));
        } catch (IOException e) {
            throw new IllegalStateException(e);
        }

        return storageName;
    }

    @Override
    public void writeFileToResponse(String name, HttpServletResponse response, String type) {
        //TODO: норм тайп делать
        System.out.println(name);

        response.setContentType(type + "/" + name.split("\\.")[1]);
        try {
            IOUtils.copy(new FileInputStream(storagePath + "\\" + name), response.getOutputStream());
            response.flushBuffer();
        } catch (Exception e) {
            throw new IllegalArgumentException(e);
        }
    }


}
