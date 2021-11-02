package com.aks.sandbox;

public class Player {

    private int number;

    private String name;

    private boolean haveBall;

    public Player(int number, String name, boolean haveBall) {
        this.number = number;
        this.name = name;
        this.haveBall = haveBall;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setHaveBall(boolean haveBall) {
        this.haveBall = haveBall;
    }

    public boolean getHaveBall() {
        return haveBall;
    }

    public void receiveBall() {
        haveBall = true;
    }

    public void giveAwayBall() {
        haveBall = false;
    }
}
