package InstanceOfRzutowanieWdol;

public class Student extends Osoba {
    public Student(String imie, String nazwisko) {
        super(imie, nazwisko);

        }

    @Override
    public void pobierzOpis() {
        System.out.println("Jestem studentem");
        super.pobierzOpis();

    }

    public void pobierzOpis3(){
            System.out.println("Jestem studentem");

    }
}
