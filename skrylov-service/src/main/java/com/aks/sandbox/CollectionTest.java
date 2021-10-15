package com.aks.sandbox;

public class CollectionTest {
    public static void main(String[] args) {

        Collection collection = new Collection();
        collection.add(27);
        if (collection.get(0) == 27) {
                System.out.println("Зашибись");
        } else {
                System.out.println("Косяк");
            }
        }
    }