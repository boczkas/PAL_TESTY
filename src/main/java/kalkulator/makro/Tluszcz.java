package kalkulator.makro;

public class Tluszcz {
    int gramy;

    public Tluszcz(int dostepneKcal) {
        this.gramy = (int)(dostepneKcal * 0.2 / 9);
    }

    public int getGramy() {
        return gramy;
    }

    public int getTotalKcal() {
        return gramy * 9;
    }

    @Override
    public String toString() {
        return "Tluszcz{" +
                "gramy=" + gramy +
                '}';
    }
}
