package com.aks.sandbox;

public class Memory {

    private int value;

    private String memProducer;

    public Memory(int value, String memProducer) {
        this.value = value;
        this.memProducer = memProducer;
    }

    public void setValue(int value){
        this.value = value;
    }

    public int getValue(){
        return value;
    }

    public void setMemProducer(String memProducer){
        this.memProducer = memProducer;
    }

    public String getMemProducer(){
        return memProducer;
    }
}
