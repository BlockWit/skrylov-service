//Задача 5
//У вас есть список имен: Alice, Bob, John, Eugeny, Alex, Mira, Serg, Ilon
//Вывести имя каждого второго.

package com.aks.sandbox.cases.case7;

public class NamesEverySecond {

    public static void main(String[] args) {

        String[] names = {"Alice", "Bob", "John", "Eugeny", "Alex", "Mira", "Serg", "Ilon"};

        for (int i=1; i < names.length; i=i+2) {
            System.out.println(names[i]);
        }
    }

}
