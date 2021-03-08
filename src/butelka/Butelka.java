package butelka;

import java.sql.BatchUpdateException;

public class Butelka {
    private double pojemnos;

    public double getPojemnos() {
        return pojemnos;
    }

    public void setPojemnos(double pojemnos) {
        this.pojemnos = pojemnos;
    }

    public Butelka(double pojemnos) {
        this.pojemnos = pojemnos;
    }

    public boolean wlej(double ileLitrow) {
        if (pojemnos >= ileLitrow)
            this.pojemnos += ileLitrow;
        else
            System.out.println("butelka jest za mała");
        return true;
    }

    public boolean wylej(double ileLitrow) {
        if (ileLitrow <= pojemnos)
            this.pojemnos -= ileLitrow;
        else
            System.out.println("nie możesz wylać więcej niż jest");
        return true;
    }

    public void przelej(double ilosc, Butelka gdziePrzelac) {
        if (this.wylej(ilosc)) {
            this.wylej(ilosc);
            gdziePrzelac.wlej(ilosc);
        }
    }

}
