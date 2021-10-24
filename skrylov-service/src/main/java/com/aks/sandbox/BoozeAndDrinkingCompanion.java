package com.aks.sandbox;

public class BoozeAndDrinkingCompanion {

    private int volumeOfBottle;

    private int volumeOfLiver;  //объём печени = объём, который могут выпить собутыльники

    private String name;

    public BoozeAndDrinkingCompanion(int volumeOfBottle) {
        this.volumeOfBottle = volumeOfBottle;
    }
    public int getVolumeOfBottle() {
        return volumeOfBottle;
    }
    public BoozeAndDrinkingCompanion(int volumeOfLiver, String name){
        this.volumeOfLiver = volumeOfLiver;
        this.name = name;
    }
    public void setVolumeOfLiver(int volumeOfLiver) {
        this.volumeOfLiver = volumeOfLiver;
    }
    public int getVolumeOfLiver() {
        return volumeOfLiver;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void withdraw(int volumeForDrink) {
        volumeOfBottle = volumeOfBottle - volumeForDrink;
    }
    public void drink(int volumeOfBottle) {
        volumeOfBottle =  volumeOfBottle-volumeOfLiver;
    }

}
