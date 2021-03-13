package Kolekcje.Set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;


public class IntPair {
    /*
    twórz klasę ParaLiczb (int a,int b) i dodaj kilka instancji do zbioru:
{(1,2), (2,1), (1,1), (1,2)}.
Wyświetl wszystkie elementy zbioru na ekran. Czy program działa zgodnie z
oczekiwaniem?

     */

    int a;
    int b;

    public IntPair() {
    }

    public IntPair(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public String toString() {
        return  "(" + a +
                "," + b +
                ')';
    }
    //LinkedHasshSet zapewnia wprowadzaną kolejność
    Set<IntPair> paryLiczb = new LinkedHashSet<>();
    void dodawanieParLiczb(int a, int b){
        IntPair parka = new IntPair(a,b);
        paryLiczb.add(parka);

    }
    void wyswietlanieZbioru(){
        System.out.println(paryLiczb);
    }
}
