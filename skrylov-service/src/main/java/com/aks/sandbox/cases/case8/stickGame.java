package com.aks.sandbox.cases.case8;

import java.util.Scanner;
import java.util.Random;

public class stickGame {

    public static void main(String[] args) {

        int countOfSticks = 5;

        Random random = new Random();

        Scanner in = new Scanner(System.in);

        boolean isComputer = false;

        for (; countOfSticks > 0; ) {
            System.out.println("В игре " + countOfSticks + " палочек");
            int dropSticks;
            int maxSticks = 3;
            if(countOfSticks < 3) {
                maxSticks = countOfSticks;
            }
            if (isComputer) {
                System.out.println("Ход компьютера ");
                dropSticks = random.nextInt(maxSticks) +1;
                System.out.println("Компьютер взял " + dropSticks + " палочек");
            } else {
                System.out.println("Ход пользователя ");
                System.out.println("Введите кол-во палочек от 1 до " + maxSticks);
                dropSticks = in.nextInt();
                System.out.println("Пользователь взял " + dropSticks + " палочек");
            }
            countOfSticks = countOfSticks - dropSticks;
            isComputer = !isComputer;
        }

        if(isComputer) {
            System.out.println("Компьютер выиграл");
        } else {
            System.out.println("Пользователь выиграл");
        }

        in.close();
    }

}
