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


        myLibrary.find(7);
       // System.out.println(myLibrary.find(4));

    }

}
