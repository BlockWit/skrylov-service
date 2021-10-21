package com.aks.sandbox.collections;

  public class Collection2 {

    private int count = 0;

    //private Box boxPrev;          // Зачем в этом классе дублируется?

    //private Box boxNext;

    public void add(int element) {
        count++;
        Box box = new Box(count);
        box.setElement(element);
    }

    public int get(int count) {
        int element = box.element(count);
        return element;
    }









}
