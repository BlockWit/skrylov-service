package com.aks.sandbox;

public class Car {
    private int mass;
    private Engine engine1;
    public Car(int mass, Engine engine1) {
        this.mass = mass;
        this.engine1 = engine1;
    }

    public void setMass(int mass) {
        this.mass = mass;
    }

    public int getMass() {
        return mass;
    }

    public void setEngine1(Engine engine1) {
        this.engine1 = engine1;
    }

    public Engine getEngine1() {
        return engine1;
    }
}
