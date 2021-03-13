package Kolekcje.Set;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Set_Exercise_1 {

    /*
Umieść wszystkie elementy tablicy {10,12,10,3,4,12,12,300,12,40,55} w
zbiorze (HashSet) oraz:
Konstruktor kopiujący elementy listy do setu:
Set<Integer> liczby = new HashSet<>(Arrays.asList(1, 2 … ));
a. Wypisz liczbę elementów na ekran (metoda size())
b. Wypisz wszystkie zbioru elementy na ekran (forEach)
c. Usuń elementy 10 i 12, wykonaj ponownie podpunkty a) i b)
d. zmień implementacje na TreeSet (zamień HashSet na TreeSet przy tworzeniu
instancji kolekcji)

 */
    public void Zbior(){
        Set<Integer> liczby = new HashSet<>(Arrays.asList(10,12,10,3,4,12,12,300,12,40,55));
        System.out.println("Zbiór liczb jako HashSet: "+liczby);
        System.out.println("Wielkość zbioru: "+liczby.size());
//        System.out.println("Zbiór liczb wypisany for each'em: ");
//        for (Integer integer : liczby) {
//            System.out.println(integer);
//        }

        liczby.removeAll(Arrays.asList(10,12));
        System.out.println("Usunięto ze zbioru liczby 10, 12: "+liczby);

        Set<Integer> liczby2 = new TreeSet<>(Arrays.asList(10,12,10,3,4,12,12,300,12,40,55));
        System.out.println("Zbiór liczb jako TreeSet: "+liczby2);
    }


}
