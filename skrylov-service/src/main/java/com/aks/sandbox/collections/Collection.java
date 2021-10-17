package com.aks.sandbox.collections;

public class Collection{
    private int i = 0;
    private int[ ] elements = new int[3];

    public void add (int element) {
      elements[i] = element;
      i++;
      if (i==elements.length-1) {
         int [ ] things1 = new int [elements.length + 2];
              for (int k=0; k<=elements.length-1; k++) {
               things1[ k ] = elements [ k ];
               }
          elements=things1;
       }
    }
    public int get(int i) {
        return elements[i];
   }

   public void del(int n) {
     int [] things2 = new int [elements.length - 1];
       for (i=0; i<n; i++) {
         things2[i] = elements[i];
       }
       for (i=n; i<=elements.length-1;i++) {
         things2[i] = elements[i++];
       }
         i--;
         elements=things2;
   }

}

