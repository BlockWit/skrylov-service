package com.aks.sandbox.cases.case6;

public class Rounds {
    public static void main(String[] args) {

        double x = 23.5;
        int result = (int)Math.round(x);
        System.out.println((result));

        double delitel = 0.25;
        int listsize = 7;
        //int delitelAfterRound = (int) Math.round(delitel);

        System.out.println((int)((listsize * delitel)));

    }

}
