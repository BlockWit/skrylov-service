package com.aks.sandbox.collections;

public class Collection {
    private int i = 0;  //переименовать осознанно
    private int[] elements = new int[1];

    public void add(int element) {
        elements[i] = element;
        i++;
        if (i == elements.length) {
            int[] elements1 = new int[elements.length + 1];
            for (int k = 0; k <= elements.length; k++) {
                elements1[k] = elements[k];
            }
            elements = elements1;
        }
    }

    public int get(int i) {
        return elements[i];
    }

    public void del(int n) {
        int[] elements2 = new int[elements.length - 1];
        for (i = 0; i < n; i++) {
            elements2[i] = elements[i];
        }
        for (i = n; i <= elements.length - 2; i++) {
            elements2[i] = elements[i + 1];
        }
        i--;
        elements = elements2;
    }

    public int size() {
        int q = 0;
        for (i = 0; i <= elements.length - 1; i++) {
            if (elements[i] != 0) {
                q++;
            }
        }

        return q;
    }
}

