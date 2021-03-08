package InstanceOfRzutowanieWdol;

public class main {
    public static void main(String[] args) {
        Osoba[] osoba = new Osoba[4];
        osoba[0] = new Pracownik("Wacław", "Szablewski",5789);
        osoba[1] = new Pracownik("Mirmił", "Jasnogórski",4000);
        osoba[2]= new Student("Wiesław","Zasada");
        osoba[2]= new Student("Roman","Wąsaty");

        //zwykła pętla for
//        for (int i = 0; i<osoba.length;i++){
//            osoba[i].pobierzOpis();
//        }

        //pętla for each
        for (Osoba persony:osoba ) {
            if (persony instanceof Pracownik)
                ((Pracownik) persony).pobierzOpis2(); // rzutowanie w dół

        }
    }

}
