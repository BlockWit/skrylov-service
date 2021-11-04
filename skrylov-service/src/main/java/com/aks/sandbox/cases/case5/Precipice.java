package com.aks.sandbox.cases.case5;

public class Precipice {

    private int breakingPoint;

    private Nigger firstNigger;

    public Precipice(int breakingPoint, Nigger firstNigger) {
        this.breakingPoint = breakingPoint;
        this.firstNigger = firstNigger;
    }

    public void setBreakingPoint(int breakingPoint) {
        this.breakingPoint = breakingPoint;
    }

    public int getBreakingPoint() {
        return breakingPoint;
    }

    public void setFirstNigger(Nigger firstNigger) {
        this.firstNigger = firstNigger;
    }

    public Nigger getFirstNigger() {
        return firstNigger;
    }

    public void clamberFirstNigger(Nigger firstNigger, Nigger nigger) {
        this.firstNigger = firstNigger;
        if (firstNigger.getMass() < breakingPoint) {
            if (firstNigger.getMass() + nigger.addNigger(nigger) < breakingPoint) {
                nigger.addNigger(nigger);
            };
        } else {
            System.out.println("Предел прочности превышен, падение");
        }
    }

}
