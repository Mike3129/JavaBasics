package Kolekcje.Exercises_2_1to6;

import java.sql.SQLOutput;
import java.util.*;

public class Exercises_2 {
    /*
Utwórz 10 elementową tablicę przechowującą liczby całkowite (int)
a. Dodaj 10 kolejnych liczb do tablicy rozpoczynając od liczby 1
b. Wyświetl długość tablicy
c. Wyświetl kolejno elementy tablicy wykorzystując pętlę for.
d. Wykorzystując pętlę for pomnóż przez 2 kolejno każdy element w tablicy i
zapisz go ponownie w tablicy.
e. Wyświetl kolejno elementy tablicy wykorzystując pętlę for
     */
    public static void task_1() {
        int[] table = new int[10];
        int suma = 1;
        for (int i = 0; i < table.length; i++) {
            table[i] = suma;
            suma = suma + 1;
        }
        System.out.println("Tablica 10 liczb: ");
        for (int tabliczka : table) {
            System.out.print(tabliczka + " ");
        }
        System.out.println();
        System.out.println("Długość tablicy: " + table.length);

        for (int i = 0; i < table.length; i++) {
            table[i] = table[i] * 2;
        }
        System.out.println("Tablica pomnożona przez 2 ");
        for (int tabliczka : table) {
            System.out.print(tabliczka + " ");
        }

    }

    /*
Utwórz listę ArrayList przechowującą liczby całkowite.
a. Dodaj 3 dowolne liczby, a następnie wyświetl długość tablicy.
b. Wyświetl pierwszy element zapisany w liście.
c. Wyświetl ostatni element zapisany w liście
     */
    public static void task_2() {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 3, 4));
        System.out.println("Pierwszy element tablicy: " + list.get(0));
        System.out.println("Ostatni element tablicy: " + list.get(list.size() - 1));
    }

    /*
Utwórz listę ArrayList przechowującą liczby zmiennoprzecinkowe. Dodaj ręcznie 10
liczb do listy.
a. Wyświetl sumę pierwszego i ostatniego elementu zapisanego w liście..
b. Wyświetl iloczyn pierwszego i ostatniego elementu zapisanego w liście.
c. Wyświetl iloraz drugiego i przedostatniego elementu zapisanego w liście.
     */

    public static void task_3() {
        ArrayList<Double> list = new ArrayList<>(Arrays.asList(1.2, 3.5, 5.8, 6.9));
        System.out.println("Lista liczb zmiennoprzecinkowych: " + list);
        double suma = list.get(0) + list.get(list.size() - 1);
        System.out.println("Suma 1go i ostatniego elementu kolekcji: " + suma);
        double iloraz = list.get(1) / list.get(list.size() - 2);
        System.out.println("Iloraz drugiego i przed ostatniego elementu listy: " + iloraz);
    }

    /*
Utwórz listę ArrayList przechowującą imiona.
a. Dodaj 5 imion do listy,
b. Wykorzystując pętle for pobierz i wyświetl kolejno wszystkie elementy z listy.
c. Wykorzystując pętle for pobierz i wyświetl kolejno wszystkie elementy z listy
zaczynając od ostatniego, a kończąc na pierwszym
     */

    public static void task_4() {
        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("Janusz");
        stringList.add("Wiechu");
        stringList.add("Jachu");
        stringList.add("Witosław");
        stringList.add("Jeremi");
        System.out.println("Lista imion: ");
        for (String imiona : stringList) {
            System.out.print(imiona + " ");
        }
        System.out.println();
        System.out.println("Lista od końca: ");
        for (int i = stringList.size() - 1; i >= 0; i--) {
            System.out.print(stringList.get(i)+" ");
        }
    }

    /*
Utwórz tablicę ArrayList przechowującą imiona
a. Korzystając z klasy Scanner pobierz od użytkownika 5 imion i zapisz je w liście.
b. Wykorzystując pętlę while wyświetl wszystkie elementy znajdujące się w liście
     */

    public static void task_5(){
        ArrayList<String> stringList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj pięć imion");
        for (int i = 0; i<5;i++){
            stringList.add(scanner.nextLine());
        }
        System.out.println("Lista dodanych imion: "+stringList);
        System.out.println("Wielkość listy: "+stringList.size());
        System.out.println("Lista imion z pętli while:");
        int i = 0;
        while (i < stringList.size())
        {
            System.out.print(stringList.get(i)+" ");
            i++;
        }
    }
    /*
Utwórz kolejkę Queue korzystając z implementacji PriorityQueue.
a. Pobierz od użytkownika ilość liczb jakie mają zostać wylosowane
b. Wylosuj wskazaną przez użytkownika ilość liczb korzystając z klasy Random
z zakresu <1,100> i dodaj je do kolejki.
c. Wyświetl kolejno liczby występujące w kolejce.
     */

    public static void task_6(){
        Queue kolejka = new PriorityQueue();
        System.out.println("Podaj ile liczb chcesz wylosować");
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        Random generator = new Random();
        for (int i = 0; i<count;i++){
            kolejka.add(generator.nextInt(100)+1);
        }
        System.out.println("Wylosowane liczby w przedziale od 1 do 100 to:");
        System.out.println(kolejka);
    }

}

