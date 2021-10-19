package com.aks.sandbox.collections.tests;

import com.aks.sandbox.collections.Collection;

public class SizeCollectionTest {
    public static void main(String[] args) {
        Collection collection = new Collection();

        collection.add(27);
        collection.add(2);
        collection.add(27);
        collection.add(2);
        collection.del(1);

        int p = collection.size();
        System.out.println(p);

        if (collection.size() == 3) {
            System.out.println("OK");
        } else {
            System.out.println("Fail");
        }
    }
}

