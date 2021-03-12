package Kolekcje.Exercise_6_Dziennik;

import java.util.List;

/*
. Klasa Student powinna:
- posiadać listę ocen studenta (List<Double>)
- posiadać (pole) numer indeksu studenta (String)
- posiadać (pole) imię studenta
- posiadać (pole) nazwisko studenta

 */
public class Student {
   private List<Double> oceny;
   private String index;
   private String imie;
   private String nazwisko;

    public Student(List<Double> oceny, String index, String imie, String nazwisko) {
        this.oceny = oceny;
        this.index = index;
        this.imie = imie;
        this.nazwisko = nazwisko;
    }

    public Student() {
    }

    public List<Double> getOceny() {
        return oceny;
    }

    public void setOceny(List<Double> oceny) {
        this.oceny = oceny;
    }

    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    @Override
    public String toString() {
        return "Student{" +
                "oceny=" + oceny +
                ", index='" + index + '\'' +
                ", imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                '}';
    }
}
