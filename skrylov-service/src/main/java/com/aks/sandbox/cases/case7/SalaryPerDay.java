//Задача 2
//Рассчитать и вывести среднюю зп в день за каждый месяц.
// Считаем что в месяце 30 дней. Исходные данные - из первой задачи.

package com.aks.sandbox.cases.case7;

public class SalaryPerDay {

    public static void main(String[] args) {

        double salaryPerMonth[] = {100,109,108,114,101,100,120,200,103,112,107,150};

        for (int i=0; i < salaryPerMonth.length; i++) {
            System.out.println(salaryPerMonth[i] / 30);
        }

    }
}
