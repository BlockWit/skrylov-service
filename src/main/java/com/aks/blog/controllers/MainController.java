package com.aks.blog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

    @GetMapping("/x+y")
    public String xy(Model model) {
        model.addAttribute("title", "Человек");
        return "x+y";
    }

    @PostMapping("/x+y")
    public String summaXY(@RequestParam int X, @RequestParam int Y, Model model) {
        model.addAttribute("title", "Человек");
        int result;
        if ((X % 1) == 0 && (0 <= X) && (X <= 255) && (Y % 1) == 0 && (0 <= Y) && (Y <= 255)) {
            result = X + Y;
            model.addAttribute("result", result);
            model.addAttribute("X", X);
            model.addAttribute("Y", Y);
        } else {
            model.addAttribute("kosyak", "Этот калькулятор не позволяет складывать такие числа. Введите X и Y типа Integer (целочисленное значение) в диапазоне от 0 до 255");
            model.addAttribute("X", X);
            model.addAttribute("Y", Y);

        }
        return "summa";
    }
}
