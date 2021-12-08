package com.aks.sandbox.collections.tests;

import com.aks.sandbox.collections.ArrayList;

public class ListTest2 {

    public static void main(String[] args) {

        ArrayList arrayListForAdd = new ArrayList();
        ArrayList arrayListForDel = new ArrayList();
        ArrayList arrayListForGet = new ArrayList();
        ArrayList arrayListForSize = new ArrayList();
        ListTests listTests = new ListTests();

        listTests.addArrayListTest(arrayListForAdd);
        listTests.delArrayListTest(arrayListForDel);
        listTests.getArrayListTest(arrayListForGet);
        listTests.sizeArrayListTest(arrayListForSize);
    }

}
