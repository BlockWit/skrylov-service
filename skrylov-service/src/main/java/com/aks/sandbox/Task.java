package com.aks.sandbox;

public class Task {

    private int points;

    private boolean solved;

    public Task(int points, boolean solved) {
        this.points = points;
        this.solved = solved;
    }
    public void setPoints(int points) {
        this.points = points;
    }
    public int getPoints() {
        return points;
    }
    public void setSolved(boolean solved) {
        this.solved = solved;
    }
    public boolean getSolved() {
        return solved;
    }
    public int solve() {
        solved = true;
        return points;
    }
}
