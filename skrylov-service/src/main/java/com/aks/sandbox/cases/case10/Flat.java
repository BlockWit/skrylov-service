//Создать класс квартира. У квартиры есть объем, кол-во комнат и сделать все возможные конструкторы.

package com.aks.sandbox.cases.case10;

public class Flat {

    private double volume;

    private int roomsQuantity;

    public Flat() {};

    public Flat(double volume, int roomsQuantity) {
        this.volume=volume;
        this.roomsQuantity = roomsQuantity;
    }

    public Flat(double volume) {
        this.volume = volume;
    }

    public Flat(int roomsQuantity) {
        this.roomsQuantity = roomsQuantity;
    }

}
