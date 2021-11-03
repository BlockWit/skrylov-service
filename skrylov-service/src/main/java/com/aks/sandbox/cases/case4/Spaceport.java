package com.aks.sandbox.cases.case4;

public class Spaceport {

    private Rocket rocket;

    private Man man;

    public Spaceport() { }  // Конструктор космодрома. Без ракеты и без человека

    public void setRocket(Rocket rocket) {
        this.rocket = rocket;
    }

    public Rocket getRocket() {
        return rocket;
    }

    public void setMan(Man man) {
        this.man = man;
    }

    public Man getMan() {
        return man;
    }

    public void rocketInSpaceport(Rocket rocket) {
        this.rocket = rocket;
    }

    public void rocketLeftSpaceport() {
        rocket = null;
    }

    public void manInSpaceport(Man man) {
        this.man = man;
    }

    public void manLeftSpaceport() {
        man = null;
    }

}
