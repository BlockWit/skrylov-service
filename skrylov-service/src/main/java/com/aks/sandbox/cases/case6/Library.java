//Написать класс Library
//В классе будет список книг
//У Library будут два метода
//1. Добавить книгу - add(Book book)
//2. Найти книгу с указанным книжным номером find(int ISBN)

package com.aks.sandbox.cases.case6;

import java.util.ArrayList;

public class Library {

    private ArrayList<Book> list;

    public void add(Book book) {
        list.add(book);
    }

    public Book find(int ISBN) {
        Book findingBook = null;
        for (int i=1; i <= list.size(); i++) {
            Book book = list.get(i);
            if (ISBN == book.getNumber()) {
                System.out.println(book.getNumber());
                findingBook = book;

            }

        }
        return findingBook;
    }


}
