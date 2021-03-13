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



}
