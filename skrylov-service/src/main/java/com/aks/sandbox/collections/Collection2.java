package com.aks.sandbox.collections;

  public class Collection2 {

    private int count = 0;  //кол-во элементов в коллекции

    public void addElement(Element currentElement) {
      currentElement.setElement(currentElement);
      count++;
      currentElement.setId(count);
    }

}
