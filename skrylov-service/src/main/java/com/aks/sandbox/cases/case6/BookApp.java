//1. Создать класс книги. У книги есть номер.
//2. Создать список (java.util.ArrayList) в который положить книги с номерами от 0 до 999999.
//3. Написать код, который ищет в списке книгу по номеру. Не используя метод get(int i) у списка


package com.aks.sandbox.cases.case6;

import java.util.ArrayList;

import com.aks.sandbox.cases.case6.Book;

public class BookApp {

    public static int numberForFinding;

    public static void main(String[] args) {

        ArrayList<Book> list = new ArrayList();

        for (int number=1; number <= 999999; number++) {
            Book book = new Book(number);
            list.add(book);
            }

        for (int i=1; i <= 999999; i++) {
                if (i == numberForFinding) {
                    System.out.println(i);
                }
            }

        }



    }

