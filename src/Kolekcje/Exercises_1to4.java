package Kolekcje;

import java.sql.SQLOutput;
import java.util.*;

public class Exercises_1to4 {
    public Exercises_1to4() {

    }

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

    public Exercises_1to4(ArrayList integerList2) {
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

    /*
Stwórz oddzielnego maina, a w nim kolejną listę String'ów. Wykonaj zadania:
- dodaj do listy elementy 10030, 3004, 4000, 12355, 12222, 67888, 111200, 225355,
2222, 1111, 3546, 138751, 235912 (jako stringi) (dodaj je posługując się metodą
Arrays.asList())
Przykład użycia Arrays.asList():
ArrayList<Integer> liczby = new ArrayList<>(Arrays.asList(23, 32, 44, 55, 677, 11, 33));
Podany przykład to tylko demonstracja metody Arrays.asList, zadanie należy wykonać
na liście String’ów.
- określ indeks elementu 138751 posługując się metodą indexOf
- sprawdź czy istnieje na liście obiekt 67888 metodą contains (wynik wypisz na ekran)
- sprawdź czy istnieje na liście obiekkt 67889 metodą contains (wynik wypisz na ekran)
- usuń z listy obiekt 67888 oraz 67889 (metoda remove)
- wykonaj ponownie powyższe sprawdzenia.- iteruj całą listę, wypisz elementy na ekran (a. w jednej linii, b. każdy element w
oddzielnej linii).
Sprawdź działanie aplikacji.
     */

    public void zadanie_3() {
        ArrayList<String> liczby = new ArrayList<>(Arrays.asList("10030", "3004", "4000", "12355",
                "12222", "67888", "111200", "225355", "2222", "1111", "3546", "138751", "235912"));
        System.out.println(liczby);
        System.out.println("Index Stringa 138751: " + liczby.indexOf("138751"));
        System.out.println("Czy na liście znajduje się String 67888? " + liczby.contains("67888"));
        System.out.println("Czy na liście znajduje się String 67889? " + liczby.contains("67889"));
        System.out.println("Usuwam z listy obiekt 67888 " + liczby.remove("67888"));
        System.out.println("Lista po usunięciu Stringa: " + liczby);
        System.out.println("Usuwam z listy obiekt 67888 " + liczby.remove("67889"));

        System.out.println("Lista - obiekt pod obiektem: ");
        for (int i = 0; i < liczby.size(); i++) {
            System.out.println(liczby.get(i));

        }

        System.out.println("Lista - obiekt obok obiektu: ");
        for (int i = 0; i < liczby.size(); i++) {
            System.out.print(liczby.get(i) + " ");

        }

    }

    /*
4. Stwórz oddzielnego maina, a w nim kolejną listę String'ów. Wykonaj zadania:
- dodaj do listy losowe 100 elementów z zakresu 0-100. (konwersja int na string to
String.valueOf())
- oblicz średnią liczb
- usuń wszystkie liczby powyżej średniej
- wypisz wszystkie liczby
- wykonaj kopię listy do tablicy
Sprawdź działanie aplikacji.
 */
    public void zadanie_4() {

        ArrayList<String> stringList = new ArrayList<>(Arrays.asList("126", "589", "289"));
        Random generator = new Random();
        for (int i = 1; i < 100; i++)
            stringList.add(String.valueOf(generator.nextInt(101)));
        System.out.println("Lista oryginalna: ");
        System.out.println(stringList);

        //średnia
        int suma = 0;
        for (int i = 0; i < stringList.size(); i++)
            suma = suma + Integer.valueOf(stringList.get(i));
        System.out.println("Suma: " + suma);
        Integer srednia = suma / Integer.valueOf(stringList.size());
        System.out.println("Srednia: " + srednia);

        //usunięcie liczb powyżej średniej
        ArrayList<Integer> intList = new ArrayList<>();
        for (String s:stringList) {
            intList.add(Integer.valueOf(s));
        }

        //poniższa pętla niestety nie działa
        for (int i = 0; i < stringList.size(); i++) {
            if (Integer.valueOf(stringList.get(i)) > srednia) {
                stringList.remove(i);
            }
        }
        System.out.println(stringList);

        //wyrzucenie wartości większych od średniej
        stringList.removeIf(number -> Integer.valueOf(number)>srednia);
        System.out.println("Lista po usunięciu wartości wyższych od "+srednia);
        System.out.println(stringList);

        //zapis listy do tablicy
        String[] tablica = new String[stringList.size()];
        for (int i = 0; i<stringList.size();i++) {
            tablica[i] = stringList.get(i);
        }
        System.out.println("Lista zapisana w postaci tablicy: ");
        System.out.println(Arrays.toString(tablica));


    }


}

