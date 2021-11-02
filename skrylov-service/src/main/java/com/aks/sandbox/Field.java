package com.aks.sandbox;

public class Field {

    private boolean haveBall;

    public Field(boolean haveBall) {
        this.haveBall = haveBall;
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
