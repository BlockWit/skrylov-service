package com.aks.sandbox.collections.tests;

import com.aks.sandbox.collections.Collection;

public class DelCollectionTest {
    public static void main(String[] args){

        Collection collection = new Collection();
        collection.add(27);
        collection.add(13);
        collection.add(2);
        collection.del(1);
        if (collection.get(1) == 2) {
            System.out.println("OK");
        } else {
            System.out.println("Fail");
        }
    }
}
