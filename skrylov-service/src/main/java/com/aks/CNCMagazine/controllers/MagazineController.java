package com.aks.CNCMagazine.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MagazineController {

    @GetMapping("/CNCMagazine")
    public String home(Model model) {
        model.addAttribute("title", "Главная страница");
        return "CNCMagazine";
    }

    //@PostMapping("/CNCMagazine")


}
