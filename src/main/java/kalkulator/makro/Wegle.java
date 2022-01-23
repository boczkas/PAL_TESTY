package kalkulator.makro;

public class Wegle {
    int gramy;

    public Wegle(int dostepneKcal) {
        this.gramy = dostepneKcal / 4;
    }

    public int getGramy() {
        return gramy;
    }

    public int getTotalKcal() {
        return gramy * 4;
    }

    @Override
    public String toString() {
        return "Wegle{" +
                "gramy=" + gramy +
                '}';
    }
}
