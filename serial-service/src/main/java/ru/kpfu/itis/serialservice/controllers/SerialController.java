package ru.kpfu.itis.serialservice.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import ru.kpfu.itis.serialservice.api.services.DirectorService;
import ru.kpfu.itis.serialservice.api.services.GenreService;

@Controller
public class SerialController {
    @Autowired
    DirectorService directorService;
    @Autowired
    GenreService genreService;

    @GetMapping("adding_serial")
    public String getAddingPage(Model model){
        model.addAttribute("directors",directorService.getAllDirector());
        model.addAttribute("genres",genreService.getAllGenre());
        return "add_serial_page";

    }
}
