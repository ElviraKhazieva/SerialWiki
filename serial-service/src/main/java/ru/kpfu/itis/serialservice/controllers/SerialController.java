package ru.kpfu.itis.serialservice.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import ru.kpfu.itis.serialservice.api.dto.SerialForm;
import ru.kpfu.itis.serialservice.api.services.DirectorService;
import ru.kpfu.itis.serialservice.api.services.GenreService;
import ru.kpfu.itis.serialservice.api.services.SerialService;

@Controller
public class SerialController {
    @Autowired
    private DirectorService directorService;
    @Autowired
    private GenreService genreService;
    @Autowired
    private SerialService serialService;

    @GetMapping("/adding/serial")
    public String getAddingPage(Model model){
        model.addAttribute("directors",directorService.getAllDirector());
        model.addAttribute("genres",genreService.getAllGenre());
        return "add_serial_page";

    }

    @PostMapping("/create")
    public String addSerial(SerialForm form){
        serialService.addSerial(form);
        return "redirect:/serial_view";
    }
}
