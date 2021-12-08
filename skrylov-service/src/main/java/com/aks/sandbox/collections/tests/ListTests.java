package com.aks.sandbox.collections.tests;

import com.aks.sandbox.collections.ArrayList;
import com.aks.sandbox.collections.IList;

public class ListTests {

    public void addArrayListTest(IList list) {
        list.add(27);
        list.add(2);
        if (list.get(1) == 2) {
            System.out.println("Ok");
        } else {
            System.out.println("Fail");
        }
    }

    public void getArrayListTest(IList list) {
        list.add(27);
        list.add(2);
        if (list.get(1) == 2) {
            System.out.println("Ok");
        } else {
            System.out.println("Fail");
        }
    }

    public void delArrayListTest(IList list) {
        list.add(27);
        list.add(13);
        list.add(2);
        list.del(1);
        if (list.get(1) == 2) {
            System.out.println("OK");
        } else {
            System.out.println("Fail");
        }
    }

    public void sizeArrayListTest(IList list) {
        list.add(27);
        list.add(2);
        list.add(27);
        list.add(2);
        list.del(1);

        /* int p = list.size();
        System.out.println(p);
        */

        if (list.size() == 3) {
            System.out.println("OK");
        } else {
            System.out.println("Fail");
        }
    }
}
