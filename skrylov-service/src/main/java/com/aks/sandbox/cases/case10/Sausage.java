// Создать класс колбаса у которой есть процент сои и срок годности. Написать к нему все возможные варианты конструкторов.

package com.aks.sandbox.cases.case10;

public class Sausage {

    private double soiProcent;

    private int expirationDate;

    public Sausage(double soiProcent, int expirationDate) {
        this.soiProcent = soiProcent;
        this.expirationDate = expirationDate;
    }

    public Sausage(double soiProcent) {
        this.soiProcent = soiProcent;
    }

    public Sausage(int expirationDate) {
        this.expirationDate = expirationDate;
    }

    public Sausage() {};

}
