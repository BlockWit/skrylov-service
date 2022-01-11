//Задача 26
// Есть массив данных:
//9,8,7,6,5,4,3,2,1
//Вывести числа в обратном порядке

package com.aks.sandbox.cases.case7;

public class Task26 {
    public static void main(String[] args) {
        int [] array = {9,8,7,6,5,4,3,2,1};
            for (int i = array.length - 1; i >=0; i--) {
                System.out.println(array[i]);
            }
    }
}
