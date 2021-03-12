package Kolekcje.Exercise_5_Student;

//Stwórz klasę Student która posiada pola:
//        nr indeksu
//        imie
//        nazwisko
//        płeć (wartość enum)
//        W mainie stwórz instancję kolekcji typu ArrayList, która zawiera obiekty klasy Student.
//        Dodaj do kolekcji kilku studentów (dodaj je ręcznie - wpisz cokolwiek).
//        a. Spróbuj wypisać elementy listy stosując zwykłego "sout'a"
//        b. Spróbuj wypisać elementy stosując pętlę foreach
//        c. Wypisz tylko kobiety
//        d. Wypisz tylko mężczyzn
//        e. Wypisz tylko indeksy osób
public class Student {
   private int index;
   private String imie;
   private String nazwisko;
    Sex plec;

    public Student(int index, String imie, String nazwisko, Sex plec) {
        this.index = index;
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.plec = plec;
    }

    @Override
    public String toString() {
        return "Student{" +
                "index=" + index +
                ", imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", plec=" + plec +
                '}';
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

    public Sex getPlec() {
        return plec;
    }

    public void setPlec(Sex plec) {
        this.plec = plec;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }
}
