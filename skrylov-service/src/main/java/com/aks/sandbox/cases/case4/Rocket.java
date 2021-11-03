package com.aks.sandbox.cases.case4;

public class Rocket {

    private Man man;

    public Rocket() {
    }  // конструктор ракеты. Без человека

    public void setMan(Man man) {
        this.man = man;
    }

    public Man getMan() {
        return man;
    }

    public void manInRocket(Man man) {
        this.man = man;
    }

    public void manLeftRocket() {
        man = null;
    }

}
