// Создать класс принетра, у кототорого есть поля - тип бумаги, тип печати. Сделать в нем конструктор.

package com.aks.sandbox.cases.case10;

public class Printer {

    private String paperType;

    private String printType;

    public Printer(String paperType, String printType) {
        this.paperType = paperType;
        this.printType = printType;
    }

}
