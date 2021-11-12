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

    /* public void climbNextNigger(Nigger currentNigger) {
        if (firstNigger == null) {
            firstNigger = currentNigger;
            int totalMass = 0;
            while (currentNigger != null) {
                if (firstNigger.getMass() < breakingPoint) {
                    firstNigger.setNextNigger(currentNigger);
                    totalMass = totalMass + currentNigger.getMass();
                    if (totalMass < breakingPoint) {
                        System.out.println("Висим дальше");
                        currentNigger = currentNigger.getNextNigger();
                    } else {
                        System.out.println("Предел прочности превышен, падение");
                    }
                }
            }
        }
    } */

    public void climbNextNigger(Nigger nextNigger) {
        if (firstNigger == null)  {
            if(nextNigger.getMass() > breakingPoint) {
                System.out.println("Предел прочности превышен, падение");
                return;
            }
            firstNigger = nextNigger;
        } else {
            int totalMass = 0;

            Nigger currentNigger = firstNigger;
            Nigger lastNigger = firstNigger;

            while (currentNigger != null) {
                totalMass = totalMass + currentNigger.getMass();
                lastNigger = currentNigger;
                currentNigger = currentNigger.getNextNigger();
            }

            if(totalMass > breakingPoint) {
                System.out.println("Предел прочности превышен, падение");
            } else {
                lastNigger.setNextNigger(nextNigger);
            }
        }
    }
}
