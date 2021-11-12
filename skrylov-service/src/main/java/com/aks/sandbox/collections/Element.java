package com.aks.sandbox.collections;

public class Element {

    private int id;

    private Element Element;

    public Element(int id, Element nextElement) {
        this.id = id;
        this.Element = nextElement;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setElement(Element Element) {
        this.Element = Element;
    }

    public Element getElement() {
        return Element;
    }

}
