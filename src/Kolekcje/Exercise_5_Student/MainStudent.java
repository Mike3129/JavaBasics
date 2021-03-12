package Kolekcje.Exercise_5_Student;

import java.util.ArrayList;

public class MainStudent {
    public static void main(String[] args) {


        ArrayList<Student> studentList = new ArrayList<>();
        studentList.add(new Student(12,"Zbyszek","Wiesławski",Sex.MEŻCZYZNA));
        studentList.add(new Student(11,"Jarzębina","Pomorska",Sex.KOBIETA));
        studentList.add(new Student(10,"Mięcisław","Specjalny",Sex.MEŻCZYZNA));
        studentList.add(new Student(13,"Jarcio","Bodeński",Sex.MEŻCZYZNA));
        studentList.add(new Student(9,"Frania","Poznańska",Sex.KOBIETA));

        System.out.println("Wypisanie zwykłej listy");
        System.out.println(studentList);

        System.out.println("Wypisanie listy za pomocą foreach");
        for (Student studenciaki:studentList ) {
            System.out.println(studenciaki);
        }

        //Same kobiety
        System.out.println("Lista - same kobiety");
        for (Student studenciaki:studentList ) {
            if (studenciaki.getPlec().equals(Sex.KOBIETA))
                System.out.println(studenciaki);
        }

        //Sami faceci
        System.out.println("Lista - sami mężczyźni");
        for (Student studenciaki:studentList ) {
            if (studenciaki.getPlec().equals(Sex.MEŻCZYZNA))
                System.out.println(studenciaki);
        }

        //Same numery indexów
        System.out.println("Lista - same indexy");
        for (Student studenciaki:studentList ) {
                System.out.println(studenciaki.getIndex());
        }




    }
}
