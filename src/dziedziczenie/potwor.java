package dziedziczenie;

public class potwor {

    public double predkoscChodzenia = 20.4;
    public double zywotnosc = 10;

    public potwor(){

    }

    public potwor(double predkoscChodzenia, double zywotnosc) {
        this.predkoscChodzenia = predkoscChodzenia;
        this.zywotnosc = zywotnosc;
    }

    public void atakuj (){
        System.out.println("Metoda atakuj z klasy potwór");
    }
}
