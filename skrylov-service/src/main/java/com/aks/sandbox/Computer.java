package com.aks.sandbox;

public class Computer {

    private int year;

    private String compProducer;

    private Processor processor;

    private Memory memory;

    public Computer(int year, String compProducer, Processor processor, Memory memory){
        this.year = year;
        this.compProducer = compProducer;
        this.processor = processor;
        this.memory = memory;
    }

    public void setYear(int year){
        this.year = year;
    }

    public int getYear(){
        return year;
    }

    public void setCompProducer(String compProducer){
        this.compProducer = compProducer;
    }

    public String getCompProducer() {
        return compProducer;
    }

    public void setProcessor(Processor processor) {
        this.processor=processor;
    }

    public Processor getProcessor(){
        return processor;
    }

    public void setMemory(Memory memory){
        this.memory = memory;
    }

    public Memory getMemory(){
        return memory;
    }
}
