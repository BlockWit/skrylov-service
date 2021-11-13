package com.aks.sandbox.collections;

public class CollectionByBoxes {

    private int count = 0;   // кол-во элементов в коллекции

    private Box firstBox;

    public CollectionByBoxes(int count, Box firstBox) {
        this.count = count;
        this.firstBox = firstBox;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getCount() {
        return count;
    }

    public void setFirstBox(Box firstBox) {
        this.firstBox = firstBox;
    }

    public Box getFirstBox() {
        return firstBox;
    }

    public void addElement(Integer nextElementOfCollection) {
        if (firstBox == null) {
            count++;
            Box currentBox = firstBox.getNextBox();   //перед этим по идее сначала надо вызвать метод setNextBox, но не получается
            Box firstBox = new Box(nextElementOfCollection, 1, null, currentBox);
            firstBox.setElementOfCollection(nextElementOfCollection);

        } else {
            Box currentBox = firstBox;
            currentBox = firstBox.getNextBox();
        }
    }
}
