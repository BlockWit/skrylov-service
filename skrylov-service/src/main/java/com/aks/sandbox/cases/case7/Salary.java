//Задача 1
//Задан массив заработных плат сотрудника за последние 12 месяцев:
//100,109,108,114,101,100,120,200,103,112,107,150
//Сотрудник уходит в отпуск на месяц. Необходимо рассчитать отпускные.
//Отпускные - за месяц - это средняя заработная плата за последние 12 месяцев.
//При решении использовать цикл.

package com.aks.sandbox.cases.case7;

public class Salary {

    public static void main(String[] args) {

        double salaryPerMonth[] = {100,109,108,114,101,100,120,200,103,112,107,150};

        double vacationPay = 0;
        double salaryForYear = 0;

        for(int i=0; i<salaryPerMonth.length; i++) {
           salaryForYear = salaryForYear + salaryPerMonth[i];
            }
        vacationPay = salaryForYear / 12;

    System.out.println(vacationPay);
    }

}
