//Задача 9
//Вы турагенство.
//У вас появились горящие путевки в рай.
//И у вас есть список клиентов: Lucefer, Mamona, Asmodey, Wezewolf, Leviafan, Belfegor.
//Часть этих клиентов отметили что  хотели бы получать оповещения о горящих путевках в рай.
//Отметки хранятся в виде boolean массива соответствующего порядку имен клиентов:
//false, true, true, false, true, true
//Необходимо вывести имена тех клиентов, которым нужно прислать письмо с предложением о горящей путевке в рай.

package com.aks.sandbox.cases.case7;

public class ParadiseForDemons {

    public static void main(String[] args) {

        String[] demons = {"Lucefer", "Mamona", "Asmodey", "Wezewolf", "Leviafan", "Belfegor" };
        Boolean[] demonsDesires = {false, true, true, false, true, true};

        for (int i = 0; i < demonsDesires.length; i++) {
            if (demonsDesires[i] == true) {
                System.out.println(demons[i]);
            }
        }


    }

}
