package com.aks.sandbox.collections;

public class Box {

    private Integer elementOfCollection;

    private int id;

    private Box prevBox;

    private Box nextBox;

    public Box(Integer elementOfCollection, int id, Box prevBox, Box nextBox) {
        this.elementOfCollection = elementOfCollection;
        this.id = id;
        this.prevBox = prevBox;
        this.nextBox = nextBox;
    }
    public void setElementOfCollection(Integer elementOfCollection) {
        this.elementOfCollection = elementOfCollection;
    }
    public Integer getElementOfCollection() {
        return elementOfCollection;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }
    public void setPrevBox(Box prevBox) {
        this.prevBox = prevBox;
    }
    public Box getPrevBox() {
        return prevBox;
    }
    public void setNextBox(Box nextBox) {
        this.nextBox = nextBox;
    }
    public Box getNextBox() {
        return nextBox;
    }

}
