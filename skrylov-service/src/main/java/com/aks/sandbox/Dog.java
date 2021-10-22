package com.aks.sandbox;

public class Dog {

    private String name;

    private int volumeStomach;

    private int totalVolumeFood;

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
    public void setTotalVolumeFood(int totalVolumeFood) {
        this.totalVolumeFood = totalVolumeFood;
    }
    public int getTotalVolumeFood() {
        return totalVolumeFood;
    }
    public void eat(int volumeNewFood) {
        int totalVolumeFood = 0;
        totalVolumeFood = totalVolumeFood + volumeNewFood;
    }
    public String satiety() {
        String infoSatiety;
        if (totalVolumeFood > volumeStomach/2) {
            infoSatiety = "Сыта";
        } else {
            infoSatiety = "Голодная";
        }
        return infoSatiety;
    }
}
