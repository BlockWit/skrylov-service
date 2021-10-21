package com.aks.sandbox.collections.tests;

import com.aks.sandbox.collections.Collection2;

public class Collection2Test {
    public static void main(String[] args) {

        Collection2 collection2 = new Collection2();
        collection2.add(27);
        collection2.add(13);
        System.out.println(collection2.get(1));
    }
}
