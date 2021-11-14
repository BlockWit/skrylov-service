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

    public Integer get(int index) {
        Box currentBox = firstBox;
        int currentIndex = 0;
        while(currentIndex != index) {
            currentIndex++;
            currentBox = currentBox.getNextBox();
        }
        return currentBox.getElementOfCollection();
    }
}
