//Задача 8
//У вас есть список имен: Alice, Bob, John, Eugeny, Alex, Mira, Serg, Ilon, Zelda, Gora, Seve
//Вывести имя каждого второго и пятого в одном цикле.
//Дополнительная задача.
//Ее решить до 8-ой.

package com.aks.sandbox.cases.case7;

public class NamesEverySecondAndFive {

    public static void main(String[] args) {

        String[] names = {"Alice", "Bob", "John", "Eugeny", "Alex", "Mira", "Serg", "Ilon" , "Zelda" , "Gora" , "Seve"};

        for (int i = 0; i < names.length; i++) {
            if ((i+1) % 2 == 0) {
                System.out.println("Каждый второй: " + names[i]);
            }
            if ((i +1) % 5 == 0) {
                System.out.println("Каждый пятый: " + names[i]);
            }
        }

    }
}