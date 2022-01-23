package kalkulator.makro;

public class Bialko {
    int masaCiala;
    int gramy;

    public Bialko(int masaCiala) {
        this.masaCiala = masaCiala;
        this.gramy = masaCiala * 2;
    }

    public int getTotalKcal() {
        return gramy * 4;
    }

    public int getGramy() {
        return gramy;
    }

    @Override
    public String toString() {
        return "Bialko{" +
                "masaCiala=" + masaCiala +
                ", gramy=" + gramy +
                '}';
    }
}
