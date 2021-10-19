package com.aks.sandbox;

public class Link {
    private int id;

    private Link linkPrev;

    private Link linkNext;

    public Link(int id, Link linkPrev, Link linkNext) {
        this.id = id;
        this.linkPrev = linkPrev;
        this.linkNext = linkNext;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void connectPrev(Link linkPrev) {
        this.linkPrev = linkPrev;
    }

    public Link getLinkPrev(){
        return linkPrev;
    }

    public void disconnectPrev() {
        linkPrev = null;
    }

    public void connectNext(Link linkNext) {
        this.linkNext = linkNext;
    }

    public Link getLinkNext() {
        return linkNext;
    }

    public void disconnectNext() {
        linkNext = null;
    }
}
