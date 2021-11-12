package com.aks.sandbox.collections;

public class Collection2 {

    private int count = 0;  //кол-во элементов в коллекции

    private Element firstElement;

    public void addElement(Element addedElement) {
        Element currentElement = firstElement;
        if (count == 0) {
            firstElement = addedElement;
            firstElement.setId(1);
            count++;
        } else {
            currentElement.setNextElement(addedElement);  //главный смысл здесь
            currentElement.setId(count);
            count++;
        }

    }
}
