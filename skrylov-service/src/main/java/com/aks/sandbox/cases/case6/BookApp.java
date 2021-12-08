//1. Создать класс книги. У книги есть номер.
//2. Создать список (java.util.ArrayList) в который положить книги с номерами от 0 до 999999.
//3. Написать код, который ищет в списке книгу по номеру.

package com.aks.sandbox.cases.case6;

import java.util.ArrayList;

import com.aks.sandbox.cases.case6.Book;

public class BookApp {

    public static void main(String[] args) {

        ArrayList<Book> list = new ArrayList();

        for (int number=1; number <= 999999; number++) {
            Book book = new Book(number);
            for (int j=1; j<=999999; j++) {
                list.add(j, book);
            }
        }



    }
}
