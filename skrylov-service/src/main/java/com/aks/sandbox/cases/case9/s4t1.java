package com.aks.sandbox.cases.case9;

//Написать программу, которая спрашивает у пользователя его год рождения и имя.
// Затем вычисляет сколько ему лет и выводит в формате: "<имя>, вам <кол-во_лет> лет"

    import java.util.Scanner;

public class s4t1 {
    public static void main(String[] args) {
        System.out.println(" Ваш год рождения? " + " Ваше имя? ");
        Scanner in = new Scanner(System.in);
        int birthYear = in.nextInt();
        System.out.println(birthYear);
        Scanner in2 = new Scanner(System.in);
        String name = in2.nextLine();
        System.out.println(name);

        int years = 2022 - birthYear;
        System.out.println( name  +  " вам " + years + " лет ");

    }
}