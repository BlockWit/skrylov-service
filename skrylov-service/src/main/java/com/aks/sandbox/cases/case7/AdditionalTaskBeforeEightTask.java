//Дополнительная задача.
//Ее решить до 8-ой.
//Решить пятую задачу не меняя параметры цикла:
//for(int i=0; i<names.length; i++) {
//   Тут ваш код
//   }
//Подсказка:
//1. Использовать оператор ветвления
//2. Операция получения остатка от деления:
//что_делим % на_что_делим
//5-ая задача:
//У вас есть список имен: Alice, Bob, John, Eugeny, Alex, Mira, Serg, Ilon
//Вывести имя каждого второго.

package com.aks.sandbox.cases.case7;

public class AdditionalTaskBeforeEightTask {

    public static void main(String[] args) {

        String[] names = {"Alice", "Bob", "John", "Eugeny", "Alex", "Mira", "Serg", "Ilon"};

        for (int i=1; i<names.length; i++) {
            if (i % 2 != 0) {
                System.out.println(names[i]);
            }
        }
    }

}
