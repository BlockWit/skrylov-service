package com.aks.sandbox;

public class Booze {

    private int volumeOfBottle;

    public Booze(int volumeOfBottle) {
        this.volumeOfBottle = volumeOfBottle;
    }
    public int getVolumeOfBottle() {
        return volumeOfBottle;
    }
    public int withdraw(int volumeForDrink) {
        if (volumeForDrink < volumeOfBottle) {
            volumeOfBottle = volumeOfBottle - volumeForDrink;
            return volumeForDrink;
        } else {
            volumeForDrink = volumeOfBottle;
            volumeOfBottle = 0;
            return volumeForDrink;
        }
    }


}
