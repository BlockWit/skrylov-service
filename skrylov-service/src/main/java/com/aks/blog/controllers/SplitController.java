package com.aks.blog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Arrays;


@Controller
public class SplitController {

    @GetMapping("/arrayin")
    public String arrayin(Model model) {
        return "arrayin";
    }

    @PostMapping("/arrayin")
    public String arrayin(@RequestParam String Z, Model model) {

        String strArr[] = Z.split(",");
        int numArr[] = new int[strArr.length];
        for (int i = 0; i < strArr.length; i++)
            numArr[i] = Integer.parseInt(strArr[i]);

        Arrays.sort(numArr);

        System.out.println(Arrays.toString(numArr));

        Arrays.toString(numArr);
        model.addAttribute("numArr", numArr);
        System.out.println(numArr);

        return ("arrayout");

    }


}
