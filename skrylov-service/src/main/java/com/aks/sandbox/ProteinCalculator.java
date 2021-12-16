package com.aks.sandbox;

public class ProteinCalculator {

    public static void main(String[] args) {

        String string = "i don't believe a word";

        String metallika = "shining on a crazy diamond";

        int year = year = 1986;
        String name = "Sereja";
        int age = 2021 - year;

        System.out.println(name + " имеет возраст " + year);

        double mass = 74;

        Boolean isWoman = false;

        if (isWoman == true) {
            double volumeOfProtein = 1.5 * mass;
            double volumeOfCarbohydrates = 1.1 * mass;
            double volumeOfFats = 2.1 * mass;
            System.out.println(volumeOfProtein +"  "+ volumeOfFats + "  " +  volumeOfCarbohydrates);
        } else {
            double volumeOfProtein = 1.7 * mass;
            double volumeOfCarbohydrates = 2.5 * mass;
            double volumeOfFats = 1.2 * mass;
            System.out.println(volumeOfProtein +"  "+ volumeOfFats +"  "+ volumeOfCarbohydrates);
        }

        String[] arrayOfFriends = new String[4];
        arrayOfFriends[0] = "San";
        arrayOfFriends[1] = "Rus";
        arrayOfFriends[2] = "Vla";
        arrayOfFriends[3] = "Ali";

        for (int i = 0; i < arrayOfFriends.length; i++) {
            System.out.println(arrayOfFriends[i]);
        }

        int[] volumeOfPrecipitation = {23, 2, 0, 0, 1};
        for (int i = 0; i < volumeOfPrecipitation.length; i++) {
            System.out.println(volumeOfPrecipitation[i]);
        }

    }

}
