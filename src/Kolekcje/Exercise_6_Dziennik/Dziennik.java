package Kolekcje.Exercise_6_Dziennik;

/*
Klasa Dziennik powinna:
- posiadać (jako pole) listę Studentów.
- posiadać metodę 'dodajStudenta(Student):void' do dodawania nowego studenta do dziennika
- posiadać metodę 'usuńStudenta(Student):void' do usuwania studenta
- posiadać metodę 'usuńStudenta(String):void' do usuwania studenta po jego numerze indexu
- posiadać metodę 'zwróćStudenta(String):Student' która jako parametr przyjmuje numer
indexu studenta, a w wyniku zwraca konkretnego studenta.
- posiadać metodę 'podajŚredniąStudenta(String):double' która przyjmuje indeks studenta
i zwraca średnią ocen studenta.
- posiadać metodę 'podajStudentówZagrożonych():List<Student>'
- posiadać metodę 'posortujStudentówPoIndeksie():List<Student>' - która sortuje listę
studentów po numerach indeksów, a następnie zwraca posortowaną listę.
- posiadać metodę ‘dodajOcene(String, Double):void’
 */

import java.util.*;

public class Dziennik {
    ArrayList<Student> listOfStudents = new ArrayList<>();

    public void dodajStudenta(Student student) {
        listOfStudents.add(student);
        System.out.println("Lista studentów: ");
        System.out.println(listOfStudents);
    }

    public void usunStudenta(Student student) {
        listOfStudents.remove(student);
        System.out.println("Lista studentów po usunięciu: ");
        System.out.println(listOfStudents);
    }

    public void usunStudentaPoIndexie(String index) {
        listOfStudents.removeIf(string -> string.getIndex().equals(index));
        System.out.println(listOfStudents);
    }

    public void zwrocStudentaPoIndexie(String index) {
        for (Student listOfStudent : listOfStudents) {
            if (listOfStudent.getIndex().equals(index))
                System.out.println(listOfStudent);
        }
    }

    public void zwrocSredniaStudentaOpodanymIndexie(String index) {
        double suma = 0;
        for (Student listOfStudent : listOfStudents) {
            if (listOfStudent.getIndex().equals(index)) {
                for (int i = 0; i < listOfStudent.getOceny().size(); i++)
                    suma = suma + listOfStudent.getOceny().get(i);
                System.out.println("Srednia dla studenta o indexie " + index + " jest równa: "
                        + suma / listOfStudent.getOceny().size());
            }
        }
    }

    public void zwrocStudentowZagrozonych() {
        ArrayList<Student> listaZagrozonych = new ArrayList<>();

        for (int i = 0; i < listOfStudents.size(); i++) {
            double suma = 0;
            double srednia = 0;
            Student studencik = listOfStudents.get(i);
            for (int j = 0; j < studencik.getOceny().size(); j++) {
                suma = suma + studencik.getOceny().get(j);
            }
            srednia = suma / studencik.getOceny().size();
            System.out.println("Lista ocen: " + studencik.getOceny() + " " + "Suma ocen: " + suma + " " + "Srednia ocen: " + srednia);

            if (srednia < 2.0) {
                System.out.println("Zagrożeni studenci:");
                System.out.println(studencik);
                listaZagrozonych.add(studencik);
            }
        }
        System.out.println(listaZagrozonych);

    }

    public void posortujStudentowPoIndexie() {
        listOfStudents.sort(Comparator.comparing(Student::getIndex));
        System.out.println(listOfStudents);
    }

    //istotne jest aby dodać ocenę do listy nie do Arryas.aslist
    //Arrays.asList można podmienić ale nie można tam dodać elementów.
    public void dodajOcene(String index,Double ocena) {
        for (Student studencik: listOfStudents) {
            if (studencik.getIndex().equals(index)) {
                studencik.getOceny().add(ocena);
                System.out.println(studencik);
            }
        }

    }

    /*
    Polecenia VarArgs:
- dodanie kilku studentów
- usunięcie kilku studentów
- wyszukiwanie studentów (i zwrócenie znalezionych w liście)
- dodanie/usuwanie ocen studentom
Wszystkie polecenia zrealizowane jako VarArgs.
     */

    public void dodanieKilkuStudentow(Student... studenty) {
        for (Student student : studenty) {
            listOfStudents.add(student);
        }
        System.out.println(listOfStudents);
    }

    public void usuniecieKilkuStudentow(Student...students){
        for (Student student : students) {
            listOfStudents.remove(student);
        }
        System.out.println(listOfStudents);
    }

}




