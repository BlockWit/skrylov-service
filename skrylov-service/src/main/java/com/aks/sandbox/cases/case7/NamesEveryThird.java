//Задача 6
//У вас есть список имен: Alice, Bob, John, Eugeny, Alex, Mira, Serg, Ilon, Zelda
//Вывести имя каждого третьего.

package com.aks.sandbox.cases.case7;

public class NamesEveryThird {

    public static void main(String[] args) {

        String[] names = {"Alice", "Bob", "John", "Eugeny", "Alex", "Mira", "Serg", "Ilon", "Zelda"};

        for(int i = 2; i < names.length; i=i+3) {
            System.out.println(names[i]);
        }

    }

}
