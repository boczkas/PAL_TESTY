package kalkulator;

import kalkulator.makro.Bialko;
import kalkulator.makro.Tluszcz;
import kalkulator.makro.Wegle;
import kalkulator.makro.Zapotrzebowanie;

public class Kalkulator {

    int masaCiala;
    int kcal;
    BialeczkoCounter bialeczkoCounter;
    TluszczeCounter tluszczeCounter;
    WegleCounter wegleCounter;

    public Kalkulator(int masaCiala, int kcal,
                      BialeczkoCounter bialeczkoCounter,
                      TluszczeCounter tluszczeCounter,
                      WegleCounter wegleCounter) {
        this.masaCiala = masaCiala;
        this.kcal = kcal;
        this.bialeczkoCounter = bialeczkoCounter;
        this.tluszczeCounter = tluszczeCounter;
        this.wegleCounter = wegleCounter;
    }

    public Zapotrzebowanie count() {
        Bialko bialko = bialeczkoCounter.count(masaCiala);
        Tluszcz tluszcz = tluszczeCounter.count(kcal);
        Wegle wegle = wegleCounter.count(kcal - bialko.getTotalKcal() - tluszcz.getTotalKcal());

        return new Zapotrzebowanie.ZapotrzebowanieBuilder()
                .setBialko(bialko)
                .setTluszcz(tluszcz)
                .setWegle(wegle)
                .build();
    }
}
