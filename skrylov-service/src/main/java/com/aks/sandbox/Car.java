package com.aks.sandbox;

public class Car {

    private int mass;

    private Engine engine;

    public Car(int mass, Engine engine) {
        this.mass = mass;
        this.engine = engine;
    }

    public void setMass(int mass) {
        this.mass = mass;
    }

    public int getMass() {
        return mass;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Engine getEngine() {
        return engine;
    }
}
