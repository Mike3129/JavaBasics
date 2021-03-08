package InstanceOfRzutowanieWdol;

abstract class Osoba {
    String imie;
    String nazwisko;

    Osoba(String imie, String nazwisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
    }

    public void pobierzOpis(){
        System.out.println("Imię: "+imie);
        System.out.println("Nazwisko: "+nazwisko);
    }


    }

