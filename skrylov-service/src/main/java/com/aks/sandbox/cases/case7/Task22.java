//Задача 22
// Есть массив данных:
//223,766,487,23
//Вывести каждое второе число

package com.aks.sandbox.cases.case7;

    public class Task22 {
        public static void main(String[] args) {
            int [] array = {223,766,487,23};

                for (int i = 1; i < array.length; i = i+2) {
                    System.out.println(array[i]);
                }
        }
    }
