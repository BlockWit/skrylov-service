//Написать класс Library
//В классе будет список книг
//У Library будут два метода
//1. Добавить книгу - add(Book book)
//2. Найти книгу с указанным книжным номером find(int ISBN).
//3. Написать метод нахождения книги через деление на 2.

package com.aks.sandbox.cases.case6;

import java.util.ArrayList;

import java.util.Collections;
import java.util.Comparator;

public class Library {

    private ArrayList<Book> list;

    public Library(ArrayList<Book> list) {
        this.list = list;
    }

    public void add(Book book) {
        list.add(book);
    }

    public Book find(int ISBN) {

        Collections.sort(list, new Comparator<Book>() {           //Сначала сортируем, потом ищем делением на два
            public int compare(Book book1, Book book2) {
                return book1.getNumber().compareTo(book2.getNumber());
            }
        });

        System.out.println("Отсортированный по ISBN список книг: ");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getNumber());
        }

        Book book = list.get(list.size() / 2);

        if (ISBN == book.getNumber()) {
            System.out.println("Найдена книга с ISBN: " + book.getNumber());
        } else {
            while (ISBN != book.getNumber()) {
                int delitel = 2;
                if (ISBN > book.getNumber()) {
                    book = list.get(list.size() / 2 / delitel);
                    delitel = delitel * 2;
                    book.getNumber();
                } else {
                    book = list.get(list.size() / 2 / delitel);
                    delitel = delitel * 2;
                    book.getNumber();
                }

            }
            System.out.println("Найдена книга с ISBN: " + book.getNumber());
        }
        return book;
    }

    /* public Book find(ArrayList<Book> list, int ISBN) {   //Обычный метод поиска книги

        //Book findingBook = null;
        for (int i = 1; i <= list.size(); i++) {
            Book book = list.get(i);
            if (ISBN == book.getNumber()) {
                System.out.println("Найдена книга с ISBN: " + book.getNumber());
                //findingBook = book;
                return book;
            }

        }
        return null;
    } */

}


