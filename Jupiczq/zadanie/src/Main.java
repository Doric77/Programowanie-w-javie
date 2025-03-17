import Inthence.Okrąg;
import Inthence.Point;
import Inthence.Prostokat;

public class Main {
    public static void main(String[] args) {
        Point point = new Point();
        point.opis();
        point.zeruj();
        point.opis();
        Point point2 = new Point(5, 10);
        point2.opis();
        point2.przesuń(3,-4);
        point2.opis();
        point2.setX(15);
        point2.setY(20);
        point2.opis();
        Point point3 = new Point(3,7);
        point3.opis();
        Point środekOkręgu = new Point(2, 3);
        Okrąg okrąg = new Okrąg(środekOkręgu, 5);
        okrąg.opis();
        System.out.println("Pole okręgu: " + okrąg.obliczPole());
        System.out.println("Obwód okręgu: " + okrąg.obliczObwod());




    }
}