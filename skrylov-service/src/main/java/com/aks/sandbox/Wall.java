package com.aks.sandbox;

public class Wall {

    private String color;

    public Wall(String color) {
        this.color = color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getColor() {
        return color;
    }
    public void paint(String newColor) {
        color = newColor;
    }
}
