//Написать класс Library
//В классе будет список книг
//У Library будут два метода
//1. Добавить книгу - add(Book book)
//2. Найти книгу с указанным книжным номером find(int ISBN).
//3. Написать метод нахождения книги через деление на 2.

//Алгорит метода find(int ISBN):
// 1.

package com.aks.sandbox.cases.case6;

import java.util.ArrayList;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Library {

    private List<Book> list = new ArrayList<>();

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

        int delitel = 2;
        Book book = list.get(list.size() / delitel);

        if (ISBN == book.getNumber()) {
            System.out.println("Найдена книга с ISBN: " + book.getNumber());
        } else {
            while (ISBN != book.getNumber()) {
                List<Book> tempList = new ArrayList<>();
                if (ISBN > book.getNumber()) {
                    for (int j = 0; j < list.size(); j++) {


                        for (int i = list.size() / 2; i < list.size(); i++) {
                            tempList.add(j, list.get(i));
                        }
                    }


                    book = list.get(list.size() / 2);
                    book.getNumber();
                    delitel = delitel * 2;
                } else {
                    delitel = delitel * 2;
                    book = list.get(list.size() / 2 / delitel);
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

    public void copyList() {
        List<Book> sourceList = new ArrayList<>();
        List<Book> targetList = new ArrayList<>();
       // for (int i = list.size() / 2; i < list.size(); i++) {
        //    sourceList.add(j, list.get(i));
       // }
        // 13 - 5 = 8
        // 0  1  2  3  4  5  6  7  8  9  10 11
        // 48 56 73 14 25 36 75 89 99 23 41 48
        for (int k = sourceList.size() * 2 / 3; k <= sourceList.size(); k++) {
            targetList.add(k - list.size() * 2/ 3, sourceList.get(k));
        }
        // 8 -> 0
        // 9 -> 1
        // 10 -> 2
        // 11 -> 3
        // x - 8 = y
        // size - size / 3   2/3*size   size/3
        //

    }
}


