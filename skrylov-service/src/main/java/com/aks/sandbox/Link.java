package com.aks.sandbox;

public class Link {
    private int id;

    private Link linkPrev;

    private Link linkNext;

    public void connectPrev(Link linkPrev) {
        this.linkPrev = linkPrev;
    }

    public void disconnectPrev() {
        linkPrev = null;
    }

    public void connectNext(Link linkNext) {
        this.linkNext = linkNext;
    }

    public void disconnectNext() {
        linkNext = null;
    }
}
