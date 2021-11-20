package com.aks.sandbox.collections.tests;

import com.aks.sandbox.collections.ArrayList;

public class DelCollectionTest {
    public static void main(String[] args){

        ArrayList arrayList = new ArrayList();
        arrayList.add(27);
        arrayList.add(13);
        arrayList.add(2);
        arrayList.del(1);
        if (arrayList.get(1) == 2) {
            System.out.println("OK");
        } else {
            System.out.println("Fail");
        }
    }
}
