package com.aks.sandbox;

public class Player {

    private int number;

    private String name;

    private Ball ball;

    public Player(int number, String name, Ball ball) {
        this.number = number;
        this.name = name;
        this.ball = ball;
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

    public void setBall(Ball ball) {
        this.ball = ball;
    }

    public Ball getBall() {
        return ball;
    }

    public void receiveBall(Ball ball) {
        this.ball = ball;
    }

    public void giveAwayBall() {
        ball = null;
    }
}
