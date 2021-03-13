package Kolekcje.Exercise_6_Dziennik;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MainDziennik {
    public static void main(String[] args) {
        Dziennik dziennik = new Dziennik();
        List<Double> student_1 = new ArrayList<>(Arrays.asList(4.0, 4.5));
        Student student1 = new Student(student_1, "789", "Tadeusz", "Kościuszko");
        List<Double> student_2 = new ArrayList<>(Arrays.asList(2.0, 3.5));
        Student student2 = new Student(student_2, "456", "Jacek", "Walentino");
        List<Double> student_3 = new ArrayList<>(Arrays.asList(1.0, 1.0));
        Student student3 = new Student(student_3, "123", "Wiesław", "Obieżyświat");

//        dziennik.dodajStudenta(student1);
//        dziennik.dodajStudenta(student2);
//        dziennik.dodajStudenta(student3);

//        dziennik.zwrocStudentowZagrozonych();
//        dziennik.posortujStudentowPoIndexie();

        dziennik.dodanieKilkuStudentow(student1, student2, student3);
//        dziennik.dodajOcene("123",4.0);
//        dziennik.usuniecieKilkuStudentow(student1,student2);

//        dziennik.wyszukiwanieKilkuStudentow("789","456");
        dziennik.dodajOceny("123", 4.0, 5.5, 6.0);
        dziennik.usunOceny("456", 4.0, 5.5, 6.0);
    }
}
