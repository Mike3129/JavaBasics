package Kolekcje;

import java.sql.SQLOutput;
import java.util.*;

public class Exercise_1 {
    /*
1. Stwórz listę Integerów. Wykonaj zadania:
- dodaj do listy 5 elementów ze scannera
- dodaj do listy 5 elementów losowych
- wypisz elementy
Sprawdź działanie aplikacji.
*/
    public void Zadanie_1() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> integerList = new ArrayList();
        System.out.println("Podaj 5 liczb całkowitych: ");
        for (int i = 0; i < 5; i++)
            integerList.add(scanner.nextInt());
        for (Integer lista : integerList) {
            System.out.print(lista + " ");
        }
        System.out.println();
        Random generator = new Random();
        for (int j = 0; j < 5; j++) {
            integerList.add(generator.nextInt(50 + 1));
        }
        System.out.println("Dodanie losowych liczb: ");
        for (Integer lista : integerList) {
            System.out.print(lista + " ");
        }

    }


    /*
Stwórz oddzielnego maina, a w nim kolejną listę integerów. Wykonaj zadania:
- dodaj do listy 10 liczb losowych
- oblicz sumę elementów na liście (wypisz ją)
- oblicz średnią elementów na liście (wypisz ją)
- stwórz kopię listy i ją posortuj: (Collections.sort( listaDoPosortowania) - sortuje listę)
(przykład użycia Collections.sort(lista):
ArrayList<Integer> liczby = new ArrayList<>();
liczby.add(5);
liczby.add(10);
liczby.add(15);
Collections.sort(liczby);
- podaj medianę elementów na liście posortowanej (wypisz ją)
- znajdź największy i najmniejszy element na liście która nie była sortowana. Zrób to pętlą for
- po znalezieniu elementu znajdź index elementu maksymalnego używając kolejnej pętli for
- po znalezieniu elementów (największy i najmniejszy) znajdź index posługując się metodą indexof
Sprawdź działanie aplikacji.Stwórz oddzielnego maina, a w nim kolejną listę integerów.

     */

    public Exercise_1(ArrayList integerList2) {
        this.integerList2 = integerList2;
    }

    ArrayList<Integer> integerList2 = new ArrayList<>();

    public void Zadanie_2() {


//        Random generator = new Random();
//        for (int i = 0; i < 10; i++)
//            integerList2.add(generator.nextInt(50));

        System.out.println("Lista źródłowa: " + integerList2);


        //kopia listy nieposortowanej
        ArrayList<Integer> integerList3 = new ArrayList<>(integerList2);

        int suma = 0;
        for (int j = 0; j < 10; j++)
            suma = integerList2.get(j) + suma;

        System.out.println("Zsumowana lista: " + suma);

        System.out.println("Srednia wynosi: " + suma / 10);

        Collections.sort(integerList2);
        System.out.println("Posortowana lista: " + integerList2);

        int mediana;
        mediana = (integerList2.get(4) + integerList2.get(5)) / 2;
        System.out.println("Mediana wynosi: " + mediana);

        int lowest = integerList3.get(0);
        for (int i = 1; i < integerList3.size(); i++) {
            if (lowest > integerList3.get(i)) {
                lowest = integerList3.get(i);
            }
        }
        System.out.println("Najmniejsza liczba na nieposortowanej liście: " + lowest +
                " (index: " + integerList3.indexOf(lowest) + ")");

        int highest = integerList3.get(0);
        for (int z = 1; z < 10; z++) {
            if (highest < integerList3.get(z)) {
                highest = integerList3.get(z);

            }
        }
        System.out.println("Największa liczba na nieposortowanej liście: " + highest +
                " (index: " + integerList3.indexOf(highest) + ")");
        System.out.printf("Lista nieposortowana: " + integerList3);


    }
}

