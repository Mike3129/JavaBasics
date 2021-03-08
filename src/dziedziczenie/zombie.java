package dziedziczenie;

public class zombie extends potwor {
    public zombie(double predkoscChodzenia, double zywotnosc) {
        super(predkoscChodzenia, zywotnosc);
    }

    @Override
    public void atakuj() {
        super.atakuj();
        System.out.println("Metoda atakuj z klasy zombie");
    }
}
