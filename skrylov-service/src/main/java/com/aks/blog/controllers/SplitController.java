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
    public String sort(Model model) {
        return "arrayin";
    }

    @PostMapping("/arrayin")
    public String sort(@RequestParam String ArrayofInt, Model model) {//Z переименовать arrayofint переименовать в sort

        String strArr[] = ArrayofInt.split(",");
        int numArr[] = new int[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            numArr[i] = Integer.parseInt(strArr[i]);
            //Arrays.sort(numArr);  //сделать самому
        }
        System.out.println(Arrays.toString(numArr));

        boolean changed = false;
        boolean isFirstIteration = true;
        while (changed || isFirstIteration) {
            changed = false;
            isFirstIteration = false;
            for (int i = 0; i < strArr.length - 1; i++) {
                if (numArr[i] > numArr[1 + i]) {
                    int Z = numArr[i];
                    numArr[i] = numArr[1 + i];
                    numArr[1 + i] = Z;
                    changed = true;
                } /*else {
                    schetchik = 0;
                }*/
            } /*
            if (schetchik == 0) {
                break;
            } */
        }

        String resultSortArray = Arrays.toString(numArr);
        model.addAttribute("resultSortArray", resultSortArray);
        System.out.println(resultSortArray);

        return ("arrayout");

    }

}
