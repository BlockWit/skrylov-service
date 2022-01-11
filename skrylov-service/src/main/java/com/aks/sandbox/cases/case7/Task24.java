//Задача 24
// Есть массив данных:
//65,43,90,123,436,54
//Вывести 4 числа с конца

package com.aks.sandbox.cases.case7;

public class Task24 {
    public static void main(String[] args) {
        int [] array = {65,43,90,123,436,54};
            for (int i = array.length - 4; i < array.length; i++) {
                System.out.println(array[i]);
            }
    }

}
