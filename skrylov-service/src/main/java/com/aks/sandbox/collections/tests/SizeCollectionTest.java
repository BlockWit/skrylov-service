package com.aks.sandbox.collections.tests;

import com.aks.sandbox.collections.Collection;

public class SizeCollectionTest {
    public static void main(String[] args) {
        Collection collection2 = new Collection();

        collection2.add(27);
        collection2.add(2);
        collection2.add(27);
        collection2.add(2);
        collection2.del(1);

        int p = collection2.size();
        System.out.println(p);

        if (collection2.size() == 3) {
            System.out.println("OK");
        } else {
            System.out.println("Fail");
        }
    }
}

