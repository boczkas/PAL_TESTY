package kalkulator.makro;

public class Zapotrzebowanie {
    Bialko bialko;
    Tluszcz tluszcz;
    Wegle wegle;

    public Zapotrzebowanie(ZapotrzebowanieBuilder builder) {
        this.bialko = builder.bialko;
        this.tluszcz = builder.tluszcz;
        this.wegle = builder.wegle;
    }

    public static class ZapotrzebowanieBuilder {
        Bialko bialko;
        Tluszcz tluszcz;
        Wegle wegle;

        public ZapotrzebowanieBuilder setBialko(Bialko bialko) {
            this.bialko = bialko;
            return this;
        }

        public ZapotrzebowanieBuilder setTluszcz(Tluszcz tluszcz) {
            this.tluszcz = tluszcz;
            return this;
        }

        public ZapotrzebowanieBuilder setWegle(Wegle wegle) {
            this.wegle = wegle;
            return this;
        }

        public Zapotrzebowanie build() {
            return new Zapotrzebowanie(this);
        }
    }

    @Override
    public String toString() {
        return "Zapotrzebowanie{" +
                "bialko=" + bialko +
                ", tluszcz=" + tluszcz +
                ", wegle=" + wegle +
                '}';
    }
}
