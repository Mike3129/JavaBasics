package dziedziczenie;

public class pies {
   private String rasa;
   private String kolorKlakow;
   private double wiek;

    public String getRasa() {
        return rasa;
    }

    public void setRasa(String rasa) {
        this.rasa = rasa;
    }

    public String getKolorKlakow() {
        return kolorKlakow;
    }

    public void setKolorKlakow(String kolorKlakow) {
        this.kolorKlakow = kolorKlakow;
    }

    public double getWiek() {
        return wiek;
    }

    public void setWiek(double wiek) {
        this.wiek = wiek;
    }

    public pies(String rasa, String kolorKlakow, double wiek) {
        this.rasa = rasa;
        this.kolorKlakow = kolorKlakow;
        this.wiek = wiek;
    }

    @Override
    public String toString() {
        return "pies{" +
                "rasa='" + rasa + '\'' +
                ", kolorKlakow='" + kolorKlakow + '\'' +
                ", wiek=" + wiek +
                '}';
    }
}
