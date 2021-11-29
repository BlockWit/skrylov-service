package com.aks.sandbox.collections;

/* Этот список LinkedListAnotherMethodAdd отличается от списка LinkedList методом add - при добавлении элемента
не происходит проход по всем элементам */

public class LinkedListAnotherMethodAdd implements IList {

    private Box firstBox;

    private Box lastBox;

    public LinkedListAnotherMethodAdd(Box firstBox) {

        this.firstBox = firstBox;
    }

    public void setFirstBox(Box firstBox) {
        this.firstBox = firstBox;
    }

    public Box getFirstBox() {
        return firstBox;
    }

    @Override
    public void add(Integer nextElementOfCollection) {
        if (lastBox == null) {
            lastBox = new Box(nextElementOfCollection, null);
        } else {
           lastBox.setNextBox(new Box(nextElementOfCollection, null));
           lastBox = lastBox.getNextBox();
        }
    }

    @Override
    public int get(int index) {
        Box currentBox = firstBox;
        int currentIndex = 0;
        while (currentIndex != index) {
            currentIndex++;
            currentBox = currentBox.getNextBox();
        }
        return currentBox.getElementOfCollection();
    }

    @Override
    public int size() {
        Box currentBox = firstBox;
        int count = 0;
        while (currentBox != null) {
            count++;
            currentBox = currentBox.getNextBox();
        }
        return count;
    }

    @Override
    public void del(int index) {
        Box boxForDel = firstBox;
        int currentIndex = 0;
        while (currentIndex != index) {
            currentIndex++;
            boxForDel = boxForDel.getNextBox();
        }
        currentIndex = 0;
        Box prevBoxForDel = firstBox;
        while (currentIndex != (index-1)) {
            currentIndex++;
            prevBoxForDel = prevBoxForDel.getNextBox();
        }
        currentIndex = 0;
        Box nextBoxForDel = firstBox;
        while(currentIndex != (index+1)) {
            currentIndex++;
            nextBoxForDel = nextBoxForDel.getNextBox();
        }
        prevBoxForDel.setNextBox(nextBoxForDel);
    }
}


