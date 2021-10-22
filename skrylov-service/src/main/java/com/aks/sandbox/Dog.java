package com.aks.sandbox;

public class Dog {

    private String name = "Guchka";

    private int volumeStomach;

    public Dog(String name, int volumeStomach) {
        this.name = name;
        this.volumeStomach = volumeStomach;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setVolumeStomach(int volumeStomach) {
        this.volumeStomach = volumeStomach;
    }
    public int getVolumeStomach() {
        return volumeStomach;
    }
    public void volumeFood(int volumeNewFood) {
        int totalVolumeFood = 0;
        totalVolumeFood = totalVolumeFood + volumeNewFood;
    }
    public String satiety(int totalVolumeFood) {
        String infoSatiety;
        if (totalVolumeFood > volumeStomach/2) {
            infoSatiety = "Сыта";
        } else {
            infoSatiety = "Голодная";
        }
        return infoSatiety;
    }
}
