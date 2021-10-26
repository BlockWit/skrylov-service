package com.aks.sandbox;

public class Booze {

    public int volumeOfBottle;

    public Booze(int volumeOfBottle) {
        this.volumeOfBottle = volumeOfBottle;
    }
    public int getVolumeOfBottle() {
        return volumeOfBottle;
    }
    public void withdraw(int volumeForDrink) {
        volumeOfBottle = volumeOfBottle - volumeForDrink;
    }


}
