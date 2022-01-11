package com.aks.sandbox.cases.case6;

import java.util.ArrayList;

public class LibraryTestApp {

    public static void main(String[] args) {

        Library myLibrary = new Library();

        myLibrary.add(new Book(7));
        myLibrary.add(new Book(6));
        myLibrary.add(new Book(44));
        myLibrary.add(new Book(5));
        myLibrary.add(new Book(1));
        myLibrary.add(new Book(2));
        myLibrary.add(new Book(3));
        myLibrary.add(new Book(4));
        myLibrary.add(new Book(100));
        myLibrary.add(new Book(33));
        myLibrary.add(new Book(22));
        myLibrary.add(new Book(37));
        myLibrary.add(new Book(190));
        myLibrary.add(new Book(70));
        myLibrary.add(new Book(60));
        myLibrary.add(new Book(440));
        myLibrary.add(new Book(50));
        myLibrary.add(new Book(10));
        myLibrary.add(new Book(20));
        myLibrary.add(new Book(30));
        myLibrary.add(new Book(40));
        myLibrary.add(new Book(1000));
        myLibrary.add(new Book(330));
        myLibrary.add(new Book(220));
        myLibrary.add(new Book(370));
        myLibrary.add(new Book(190));

        //myLibrary.find(44);
        System.out.println(myLibrary.find(1));

    }

}
