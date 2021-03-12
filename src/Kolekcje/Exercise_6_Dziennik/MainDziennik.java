package Kolekcje.Exercise_6_Dziennik;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainDziennik {
    public static void main(String[] args) {
        Dziennik dziennik = new Dziennik();
        List<Double>  student_1 = new ArrayList<>(Arrays.asList(4.5,5.0,3.5,2.0));
        Student student1 = new Student(student_1,"123","Tadeusz","Kościuszko");
        List<Double>  student_2 = new ArrayList<>(Arrays.asList(4.5,5.0,3.5,2.0));
        Student student2 = new Student(student_2,"456","Jacek","Walentino");
        List<Double>  student_3 = new ArrayList<>(Arrays.asList(1.0,2.0,2.5,1.0));
        Student student3 = new Student(student_3,"789","Wiesław","Obieżyświat");

        dziennik.dodajStudenta(student1);
        dziennik.dodajStudenta(student2);
        dziennik.dodajStudenta(student3);

        dziennik.zwrocStudentowZagrozonych();

    }
}
