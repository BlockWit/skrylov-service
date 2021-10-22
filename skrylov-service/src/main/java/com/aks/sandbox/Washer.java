package com.aks.sandbox;

public class Washer {

    private String name;

    private int volume;

    public Washer(String name, int volume) {
        this.name = name;
        this.volume = volume;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setVolume(int volume) {
        this.volume = volume;
    }
    public int getVolume() {
        return volume;
    }

}
