package com.aks.sandbox.collections.tests;

import com.aks.sandbox.collections.ArrayList;

public class AddCollectionTest {
    public static void main(String[] args) {

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