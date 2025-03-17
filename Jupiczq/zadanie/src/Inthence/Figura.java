package Inthence;

public class Figura {
    class figura {

        //pola metody i kontruktory
        Point punkt;
        String kolor = "bialy";


        figura(){
            punkt = new Point(0,0);
        }
        figura(String kolor){
            this.kolor=kolor;
        }
        figura(Point punkt){
            this.punkt=punkt;
        }
        String getKolor(){
            return kolor;
        }
        String opis(){
            return "Klasa Figura. Kolor obiektu: "+kolor;
        }


    }

}
