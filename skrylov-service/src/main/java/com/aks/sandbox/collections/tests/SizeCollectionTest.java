package com.aks.sandbox.collections.tests;

import com.aks.sandbox.collections.ArrayList;

public class SizeCollectionTest {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();

        arrayList.add(27);
        arrayList.add(2);
        arrayList.add(27);
        arrayList.add(2);
        arrayList.del(1);

        int p = arrayList.size();
        System.out.println(p);

        if (arrayList.size() == 3) {
            System.out.println("OK");
        } else {
            System.out.println("Fail");
        }
    }
}

