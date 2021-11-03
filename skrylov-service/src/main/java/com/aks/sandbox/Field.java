package com.aks.sandbox;

public class Field {

    private Ball ball;

    public Field(Ball ball) {
        this.ball = ball;
    }

    public void setHaveBall(Ball ball) {
        this.ball = ball;
    }

    public Ball getHaveBall() {
        return ball;
    }

    public void receiveBall(Ball ball) {
        this.ball = ball;
    }

    public void giveAwayBall() {
        ball = null;
    }
}
