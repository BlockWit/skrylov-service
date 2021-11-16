package com.aks.sandbox.collections;

public class CollectionByBoxes {

    private Box firstBox;

    public CollectionByBoxes(Box firstBox) {

        this.firstBox = firstBox;
    }

    public void setFirstBox(Box firstBox) {
        this.firstBox = firstBox;
    }

    public Box getFirstBox() {
        return firstBox;
    }

    public void add(Integer nextElementOfCollection) {
        if (firstBox == null) {
            firstBox = new Box(nextElementOfCollection, null);
        } else {
            Box currentBox = firstBox;
            Box lastBox = firstBox;
            while (currentBox != null) {
                lastBox = currentBox;
                currentBox = lastBox.getNextBox();
            }
            lastBox.setNextBox(new Box(nextElementOfCollection, null));
        }
    }

    public int get(int index) {
        Box currentBox = firstBox;
        int currentIndex = 0;
        while (currentIndex != index) {
            currentIndex++;
            currentBox = currentBox.getNextBox();
        }
        return currentBox.getElementOfCollection();
    }

    public int size() {
        Box currentBox = firstBox;
        int count = 0;
        while (currentBox != null) {
            count++;
            currentBox = currentBox.getNextBox();
        }
        return count;
    }

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
        prevBoxForDel.setNextBox(nextBoxForDel)
    }
}
