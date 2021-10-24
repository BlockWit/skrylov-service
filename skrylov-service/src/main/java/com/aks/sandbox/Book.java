package com.aks.sandbox;

public class Book {

    private String author;

    private int year;

    private String name;

    private int volume;

    private int cost;

    public Book(String author, int year, String name, int volume, int cost) {
        this.author = author;
        this.year = year;
        this.name = name;
        this.volume = volume;
        this.cost = cost;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public String getAuthor() {
        return author;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public int getYear() {
        return year;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setVolume(int volume) {
        this.volume = volume;
    }
    public int getVolume() {
        return volume;
    }
    public void setCost(int cost) {
        this.cost = cost;
    }
    public int getCost() {
        return cost;
    }

}
