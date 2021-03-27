package Kolekcje.Exceptions_1;

import java.util.ArrayList;
import java.util.Arrays;

public class Exceptions_1 {
    /*
Utwórz listę ArrayList przechowującą liczby całkowite.
a. Dodaj 5 liczb do listy.
b. Pobierz 6 element z listy.
c. Uruchom aplikację i sprawdź co pokaże IntelliJ w logach oraz w stacktrace.
d. Zabezpiecz kod za pomocą klauzuli try catch.
e. W przypadku wystąpienia błędu wyświetl stosowny komunikat.
     */

    public static void task_7() {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 6, 8, 7));
        System.out.println("Lista z 5-oma elementami: " + list);
        try {
            System.out.println("6-ty element listy: " + list.get(5));
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Tablica ma rozmiar " + list.size());
            System.out.println("Nie możesz prosić o element większy niż sama tablica");
        }

    }

    /*
Utwórz zmienną typu String, a następnie przypisz do niej imię “Olgierd”.
a. Wyświetl imię tak aby imię było wyświetlone dużymi literami
b. Wyświetl imię tak aby imię było wyświetlone małymi literami
c. Wyświetl długość imienia wykorzystująć odpowiednią metodę klasy String.
d. Korzystając z odpowiedniej metody sprawdź czy imię rozpoczyna się od litery “O”
e. Korzystając z odpowiedniej metody sprawdź czy imię zawiera literę “e”.
f. Korzystając z odpowiedniej metody usuń litery “i” oraz “e” z imienia, a następnie wyświetl imię po zmianach.
g. Wykorzystując pętlę for wyświetl kolejno litery imienia wraz z ich indeksem.
Spodziewany rezultat wygląda następująco
[1] = O
[2] = l
[3] = g
[4] = i
[5] = e
[6] = r
[7] = d
     */

    public static void task_8() {
        String imie = "Olgierd";
        System.out.println("Oryginalne imie: " + imie);
        System.out.println("Imie dużymi literami: " + imie.toUpperCase());
        System.out.println("Imie małymi literami: " + imie.toLowerCase());
        System.out.println("Długość imienia: " + imie.length());
        System.out.println("Czy imię zaczyna się od O?");

        if (imie.charAt(0) == 'O') {
            System.out.println("Tak");
        } else {
            System.out.println("Nie");
        }

        System.out.println("Czy imię zawiera literę e?");
        char wanted = 'e';
        //jeżeli zawierą dany znak to wartość indexu będzie większa lub równa 0
        boolean hit = imie.indexOf(wanted) >= 0;
        System.out.println(hit);

        System.out.println("Usunięcie liter e oraz i z imienia:");
        StringBuilder sb = new StringBuilder(imie);
        sb.deleteCharAt(imie.indexOf('e'));
        sb.deleteCharAt(imie.indexOf('i'));
        System.out.println(sb);

        System.out.println("Wyświetlenie liter z numerem indexu:");
        for (int i = 0; i<imie.length();i++)
            System.out.println("["+i+"] = "+imie.charAt(i));

    }

}
