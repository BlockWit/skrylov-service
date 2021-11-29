package com.aks.sandbox.collections;

public class ArrayList implements IList {
    private int count = 0;                      // количество элементов в коллекции
    private int[] elements = new int[3];

    @Override
    public void add(Integer nextElementOfCollection) {
        elements[count] = nextElementOfCollection;
        count++;
        if (count == elements.length - 1) {
            int[] elements1 = new int[elements.length + 2];
            for (int k = 0; k <= elements.length - 1; k++) {
                elements1[k] = elements[k];
            }
            elements = elements1;
        }
    }

    @Override
    public int get(int index) {
        return elements[index];
    }

    @Override
    public void del(int n) {
        int[] elements2 = new int[elements.length - 1];
        for (int m = 0; m < n; m++) {
            elements2[m] = elements[m];
        }
        for (int l= n; l <= elements.length - 2; l++) {
            elements2[l] = elements[l + 1];
        }
        count--;
        elements = elements2;
    }

    @Override
    public int size() {
        return count;
    }
}
