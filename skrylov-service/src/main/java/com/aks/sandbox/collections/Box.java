package com.aks.sandbox.collections;

public class Box {           // box - ячейка коллекции, в которую кладётся элемент коллекции

    private int count;          // id -индекс ячейки коллекции

    //private Box boxPrev;     // не понимаю всё-таки - мы в чертёж Box засовываем размер с ссылкой Box
                             // - открываем её и видим чертёж с ссылкой Box -это бесконечность. Кроме того - проще иметь id, чем пред
                             // и след box
    //private Box boxNext;

    private int element;     // элемент коллекции (вещь), который кладётся в ячейку с индексом id

    public Box(int count) {     // конструктор фактически заменяет сеттер, поэтому сеттер не делаю
        this.count = count;
        //this.boxPrev = boxPrev;
        //this.boxNext = boxNext;
    }

    public int getId() {
        return count;
    }

    public void setElement(int element) {
        this.element = element;
    }

    public int getElement() {
        return element;
    }
}
