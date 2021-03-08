package InstanceOfRzutowanieWdol;

import java.util.Comparator;

public class Pracownik extends Osoba implements Comparable {

    double wynagrodzenie;

    public Pracownik(String imie, String nazwisko, double wynagrodzenie) {
        super(imie, nazwisko);
        this.wynagrodzenie=wynagrodzenie;
    }



    @Override
    public void pobierzOpis() {
        super.pobierzOpis();
        System.out.println("Wynagrodzenie: "+wynagrodzenie);
        System.out.println("Jestem pracownikiem");
    }

    public void pobierzOpis2() {
        System.out.println("Jestem pracownikiem");
        System.out.println("Wynagrodzenie: "+wynagrodzenie);

    }

    public double getWynagrodzenie() {
        return wynagrodzenie;
    }

    @Override
    public int compareTo(Object o) {
        Pracownik przyslany = (Pracownik)o;
        if (this.wynagrodzenie < przyslany.getWynagrodzenie())
        return -1;
        if (this.wynagrodzenie > przyslany.getWynagrodzenie())
            return 1;
        return 0;
    }
}
