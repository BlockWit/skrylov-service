package com.aks.sandbox.collections;

  public class Collection2 {

    private int count = 0;

    public void add(int element) {
        count++;
        Box box = new Box(count);
        box.setElement(element);
    }









}
