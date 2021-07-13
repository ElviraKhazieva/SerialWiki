package ru.kpfu.itis.mediaservice.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import ru.kpfu.itis.mediaservice.Image;
import ru.kpfu.itis.mediaservice.services.image.ImageService;

import javax.servlet.http.HttpServletResponse;


@Controller
public class ImageController {
    @Autowired
    private ImageService imageService;

    @GetMapping("/image/{image-name}")
    @ResponseBody
    public void getImage(@PathVariable("image-name") String name, HttpServletResponse response) {
        imageService.getImage(name, response);

    }

    //    @PostMapping("/image")
//    public ResponseEntity<String> addImage(@RequestBody Image image ) {
//        return ResponseEntity.ok(imageService.saveImage(image));
//    }
    @PostMapping("/image")
    public ResponseEntity<String> create(@RequestParam("file") MultipartFile image, @RequestParam("name") String name) {
        return ResponseEntity.ok(imageService.saveImage(new Image(image)));
    }


}
