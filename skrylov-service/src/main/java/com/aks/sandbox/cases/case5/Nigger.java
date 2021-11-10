package com.aks.sandbox.cases.case5;

public class Nigger {

    private int mass;

    private Nigger nextNigger;

    public Nigger(int mass, Nigger nextNigger) {
        this.mass = mass;
        this.nextNigger = nextNigger;
    }

    public void setMass(int mass) {
        this.mass = mass;
    }

    public int getMass() {
        return mass;
    }

    public void setNigger(Nigger nigger) {
        this.nextNigger = nextNigger;
    }

    public Nigger getNigger() {
        return nextNigger;
    }

}
