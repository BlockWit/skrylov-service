package com.aks.sandbox.cases.case6;

public class Book {

    private Integer ISBN;

    public Book(Integer ISBN) {
        this.ISBN = ISBN;
    }

    public void setNumber(Integer ISBN) {
        this.ISBN = ISBN;
    }

    public Integer getNumber() {
        return ISBN;
    }
}
