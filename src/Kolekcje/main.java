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


        Exercise_1 zadanie = new Exercise_1(integerList);
        zadanie.Zadanie_2();

    }
}
