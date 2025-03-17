package Inthence;

public class Okrąg {
    private Point środek;
    private double promień;
    public Okrąg(Point środek, double promień) {
        this.środek = środek;
        this.promień = promień;
    }

    public double obliczPole() {
        return Math.PI * promień * promień; // Wzór na pole okręgu: π * r²
    }
    public double obliczObwod() {
        return 2 * Math.PI * promień; // Wzór na obwód okręgu: 2πr
    }

    public void opis() {
        System.out.println("Okrąg o środku:");
        środek.opis();
        System.out.println("i promieniu: " + promień);
    }
}
