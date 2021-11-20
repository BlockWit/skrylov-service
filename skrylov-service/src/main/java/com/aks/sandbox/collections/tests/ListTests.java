package com.aks.sandbox.collections.tests;

import com.aks.sandbox.collections.ArrayList;
import com.aks.sandbox.collections.IList;

public class ListTests {

    public void addArrayListTest()
     {
        ArrayList arrayList = new ArrayList();
        arrayList.add(27);
        arrayList.add(2);
        if (arrayList.get(1) == 2) {
            System.out.println("Ok");
        } else {
            System.out.println("Fail");
        }
    }

}
