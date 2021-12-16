//Задача 7
//У вас есть список имен: Alice, Bob, John, Eugeny, Alex, Mira, Serg, Ilon, Zelda
//Вывести имя каждого второго.

package com.aks.sandbox.cases.case7;

public class NamesEverySecondLong {

    public static void main(String[] args) {

        String[] names = {"Alice", "Bob", "John", "Eugeny", "Alex", "Mira", "Serg", "Ilon", "Zelda"};

        for (int i = 1; i < names.length; i = i+2) {
            System.out.println(names[i]);
        }

    }


}
