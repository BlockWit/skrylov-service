package com.aks.sandbox;

public class DrinkingCompanion {

    private int volumeOfLiver;  //объём печени = объём, который могут выпить собутыльники

    private String name;

    public DrinkingCompanion (int volumeOfLiver, String name){
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
    Booze booze1 = new Booze(volumeOfLiver);

    public void drink(Booze booze1) {
        booze1.volumeOfBottle = booze1.getVolumeOfBottle() - volumeOfLiver;

    }

}
