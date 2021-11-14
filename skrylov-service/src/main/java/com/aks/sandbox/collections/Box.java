package com.aks.sandbox.collections;

public class Box {

    private Integer elementOfCollection;

    private Box nextBox;

    public Box(Integer elementOfCollection, Box nextBox) {
        this.elementOfCollection = elementOfCollection;
        this.nextBox = nextBox;
    }

    public void setElementOfCollection(Integer elementOfCollection) {
        this.elementOfCollection = elementOfCollection;
    }

    public Integer getElementOfCollection() {
        return elementOfCollection;
    }

    public void setNextBox(Box nextBox) {
        this.nextBox = nextBox;
    }

    public Box getNextBox() {
        return nextBox;
    }

}
