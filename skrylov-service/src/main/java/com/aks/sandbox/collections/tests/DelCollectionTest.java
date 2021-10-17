package com.aks.sandbox.collections.tests;

import com.aks.sandbox.collections.Collection;

public class DelCollectionTest {
    public static void main(String[] args){

        Collection collection1 = new Collection();
        collection1.add(27);
        collection1.add(13);
        collection1.add(2);
        collection1.del(1);
        if (collection1.get(1) == 13) {
            System.out.println("OK");
        } else {
            System.out.println("Fail");
        }
    }
}
