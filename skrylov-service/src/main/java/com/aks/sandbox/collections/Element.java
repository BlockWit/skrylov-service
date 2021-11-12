package com.aks.sandbox.collections;

public class Element {

    private int id;

    private Element nextElement;

    public Element(int id, Element nextElement) {
        this.id = id;
        this.nextElement = nextElement;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setNextElement(Element nextElement) {
        this.nextElement = nextElement;
    }

    public Element getNextElement() {
        return nextElement;
    }

}
