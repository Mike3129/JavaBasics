package Kolekcje.Set;

import java.util.HashSet;
import java.util.Set;

public class Duplicates {
    /*
    Zapisz statyczną metodę sprawdzającą, czy w tekście nie powtarzają się litery z
wykorzystaniem zbioru. (boolean zawieraDuplikaty(String text))
     */


    static boolean zawieraDuplikaty(String text) {
        Set tempSet = new HashSet();

        for (int i = 0; i < text.length(); i++) {
            Character l = text.charAt(i);
            tempSet.add(l);
        }
        if (text.length() == tempSet.size()) {
            System.out.println("Nie zawiera duplikatów");
            return true;
        }

        System.out.println("Zawiera duplikaty");
        return false;
    }

/*
Stwórz aplikację która przyjmuje od użytkownika ciąg znaków (dowolny). Podziel ciąg
(split) na pojedyncze litery. Twoim zadaniem jest stworzenie aplikacji która wypisze tylko
unikalne litery frazy wpisanej przez użytkownika. Pomyśl o wykorzystaniu cechy zbioru -
pamiętaj, że zbiór sam usuwa duplikaty
 */

    void unikatoweLitery(String text) {
        Set tempSet = new HashSet();

        for (int i = 0; i < text.length(); i++) {
            tempSet.add(text.charAt(i));
        }
        System.out.println(text.replaceAll("[^a-z^A-Z]","").toCharArray());
        System.out.println(text.split("\\a"));

        System.out.println(tempSet);



    }


}
