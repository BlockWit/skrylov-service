package com.aks.sandbox.collections.tests;

import com.aks.sandbox.collections.Collection;

public class AddCollectionTest {
    public static void main(String[] args) {

        Collection collection = new Collection();
        collection.add(27);
        collection.add(2);
        if (collection.get(1) == 2) {
                System.out.println("Ok");
        } else {
                System.out.println("Fail");
            }
        }
    }