package com.aks.sandbox.cases.case6;

import java.util.ArrayList;

public class LibraryTestApp {

    public static void main(String[] args) {

    Book bookStrugackie = new Book(1);
    Book bookBradbary = new Book(2);
    Book bookLukyanenko = new Book(3);
    Book bookBudgold = new Book(44);
    Book bookTolstoy = new Book(5);
    Book bookGygo = new Book(65);
    Book bookBibliya = new Book(7);

    ArrayList<Book> listOfMyBooks = new ArrayList<>();
    Library myLibrary = new Library(listOfMyBooks);

        myLibrary.add(bookBibliya);
        myLibrary.add(bookBradbary);
        myLibrary.add(bookStrugackie);
        myLibrary.add(bookBudgold);
        myLibrary.add(bookGygo);
        myLibrary.add(bookLukyanenko);
        myLibrary.add(bookTolstoy);

        Book testBook = new Book(null);
        myLibrary.find(1);
          //System.out.println(myLibrary.find(7));

    }

}
