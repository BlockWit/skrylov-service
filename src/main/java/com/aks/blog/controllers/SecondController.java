package com.aks.blog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

// TODO: Sergey should remove this controller to prevent unused files
@Controller
public class SecondController {

    @GetMapping("/second")
    public String home(Model model) {
        model.addAttribute("title", "Серёга");
        return "home";
    }

}
