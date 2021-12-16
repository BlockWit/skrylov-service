//Задача 3
//У вас есть список имен: Alice, Bob, John.
//Вывести его в прямом порядке.

//Задача 4
//У вас есть список имен: Alice, Bob, John.
//Вывести его в обратном порядке.

package com.aks.sandbox.cases.case7;

public class Names {

    public static void main(String[] args) {

        String[] names = {"Alice", "Bob", "John"};

        for (int i=0; i < names.length; i++) {
            System.out.println(names[i]);
        }

        for (int i = names.length-1; i >= 0; i--){
            System.out.println(names[i]);
        }

    }

}
