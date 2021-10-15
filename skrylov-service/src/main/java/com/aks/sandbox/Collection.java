package com.aks.sandbox;

public class Collection{
    private int i = 0;
    private int n;
    private int[ ] things = new int[3];

    public void add (int element) {
      things[i] = element;
      i++;
      if (i==things.length-1) {
         int [ ] things1 = new int [things.length + 2];
              for (int k=0; k<=things.length; k++) {
               things1[ k ] = things [ k ];
               }
          things=things1;
       }
    }
    public int get(int i) {
        return things[i];
   }

   public void del(int n) {
     int [] things2 = new int [things.length - 1];
       for (i=0; i<n; i++) {
         things2[i] = things[i];
       }
       for (i=n; i<=things.length-1;i++) {
         things2[i] = things[i++];
       }
         i--;
         things=things2;
   }

}

