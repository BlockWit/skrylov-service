package com.aks.sandbox;

public class Processor {

    private int speed;

    private String procProducer;

    public Processor(int speed, String procProducer){
        this.speed = speed;
        this.procProducer = procProducer;
    }

    public void setSpeed(int speed){
        this.speed = speed;
    }

    public int getSpeed(){
        return speed;
    }

    public void setProcProducer(String procProducer){
        this.procProducer = procProducer;
    }

    public String getProcProducer(){
        return procProducer;
    }
}
