package com.aks.sandbox.cases.case6;

public class LibraryTestApp {

    public static void main(String[] args) {

    Book bookStrugackie = new Book(1);
    Book bookBradbary = new Book(2);
    Book bookLukyanenko = new Book(3);
    Book bookBudgold = new Book(4);
    Book bookTolstoy = new Book(5);
    Book bookGygo = new Book(6);
    Book bookBibliya = new Book(7);

    Library myLibrary = new Library();

    myLibrary.add(bookBibliya);
    myLibrary.add(bookBradbary);
    myLibrary.add(bookStrugackie);
    myLibrary.add(bookBudgold);
    myLibrary.add(bookGygo);
    myLibrary.add(bookLukyanenko);
    myLibrary.add(bookTolstoy);

    myLibrary.find()

    }

}
