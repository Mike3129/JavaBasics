import InstanceOfRzutowanieWdol.Pracownik;
import InstanceOfRzutowanieWdol.Student;
import Interfejsy.Interfejsik;

import java.util.Arrays;

public class main {

    public static void main(String[] args) {

        // DZIEDZICZENIE

//        potwor p = new potwor();
//        System.out.println("Prędkość chodzenia " + p.predkoscChodzenia);
//
//        zombie z = new zombie(7,9);
//        System.out.println("Prędkość chodzenia " + z.predkoscChodzenia);
//
//        z.atakuj();
//
//        pies dog = new pies("jamnik","braz",25);
//        System.out.println("Tyn pies ma kolor: "+dog.getKolorKlakow());
//
//        System.out.println(dog);
//
//        potwor p2 = new zombie(2,3);
//        p2.atakuj();

        // CWICZENIE BUTELKA

//        Butelka[] tabButelek = new Butelka[2];
//
//        for(int i = 0; i < tabButelek.length;i++){
//
//            tabButelek[i] = new Butelka(5+i);
//            System.out.println(tabButelek[i].getPojemnos());
//        }

//        tabButelek[1].wlej(3);
//        System.out.println(tabButelek[1].getPojemnos());
//        tabButelek[1].wylej(3);
//        System.out.println(tabButelek[1].getPojemnos());
//
//        tabButelek[0].setPojemnos(5);
//        System.out.println("pojemność pierwszej bitelki została ustawiona na "+tabButelek[0].getPojemnos());
//        tabButelek[0].wylej(2);
//        System.out.println("pojemność pierwszej butelki po wylaniu " + tabButelek[0].getPojemnos());
//        tabButelek[1].przelej(5,tabButelek[0]);
//
//        System.out.println("z butelki drugiej o pojemności 6 wylano "+tabButelek[1].getPojemnos());
//        System.out.println("butelka 1 ma teraz "+tabButelek[0].getPojemnos());

//
//        tabButelek[1].wylej(3);
//        System.out.println(tabButelek[1].getPojemnos());
//
//        tabButelek[1].przelej(5,tabButelek[2]);
//        System.out.println(tabButelek[1].getPojemnos());
//        System.out.println(tabButelek[2].getPojemnos());

        //Instance Of, Klasa abstrakcyjna

//        Pracownik pracus1 = new Pracownik("Michał", "Sołtysiak", 15000);
//        pracus1.pobierzOpis2();
//        pracus1.pobierzOpis();
//
//        Student student1 = new Student("Katarzyna", "Spychalska");
//        student1.pobierzOpis3();
//        student1.pobierzOpis();
//
//       Pracownik[] pracownicy = new Pracownik[20];
//       pracownicy[0] = new Pracownik("Kazimierz","Dejna",5000);
//       pracownicy[1] = new Pracownik("Zdzisława","Sośnicka",3000);
//
//        for (Pracownik petla: pracownicy) {
//            if (petla instanceof Pracownik) {
//                petla.pobierzOpis2();
//                petla.pobierzOpis();
//
//            }
//        }

       //Interface

//        Interfejsik p = new Interfejsik();
//        p.wyswietl();

        //Sortowanie obiektów comparator

        Pracownik[] pracownik = new Pracownik[3];
        pracownik[0] = new Pracownik("Michał", "Sołtysiak",15000);
        pracownik[1] = new Pracownik("Kazimierz", "Jajko",2000);
        pracownik[2] = new Pracownik("Wiesław", "Zasada",4500);

        Arrays.sort(pracownik);
        System.out.println(pracownik[0].getWynagrodzenie());
        System.out.println(pracownik[1].getWynagrodzenie());
        System.out.println(pracownik[0].compareTo(pracownik[1]));







    }
}
