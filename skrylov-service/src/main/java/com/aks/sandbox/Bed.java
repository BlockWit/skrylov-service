package com.aks.sandbox;

public class Bed {

      private int size;

      private Mattress mattress;

      public Bed(int size, Mattress mattress) {
            this.size = size;
            this.mattress = mattress;
      }
      public void setSize(int size) {
            this.size = size;
      }
      public int getSize() {
            return size;
      }
      public void setMattress(Mattress mattress) {
            this.mattress = mattress;
      }
      public Mattress getMattress() {
            return mattress;
      }
}
