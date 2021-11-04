package com.aks.sandbox.cases.case5;

public class Nigger {

    private int mass;

    private Nigger nigger;

    private int totalMass;

    public Nigger(int mass, Nigger nigger) {
        this.mass = mass;
        this.nigger = nigger;
    }

    public void setMass(int mass) {
        this.mass = mass;
    }

    public int getMass() {
        return mass;
    }

    public void setNigger(Nigger nigger) {
        this.nigger = nigger;
    }

    public Nigger getNigger() {
        return nigger;
    }

    public int addNigger(Nigger nigger) {
        totalMass = totalMass + nigger.getMass();
        return totalMass;
    }

}
