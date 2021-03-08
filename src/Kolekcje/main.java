package Kolekcje;

import java.util.ArrayList;
import java.util.Random;

public class main {
    public static void main(String[] args) {

        //stowrzenie listy i wstrzyknięcie jej do metody
        ArrayList<Integer> integerList = new ArrayList<>();
        Random generator = new Random();
        for (int i = 0; i < 10; i++)
            integerList.add(generator.nextInt(50));


        Zadania1_11 zadanie = new Zadania1_11(integerList);
        zadanie.Zadanie_2();

    }
}
