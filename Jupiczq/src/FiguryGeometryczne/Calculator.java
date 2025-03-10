package FiguryGeometryczne;


import RunInput.Input;

public class Calculator {

    public void RunTask(){
        Input input  = new Input();
        System.out.println("Wybierz figurę");
        System.out.println("Koło");
        System.out.println("Kwadrat");
        System.out.println("Stożek");
        System.out.println("Sześcian");
        System.out.println("Prostopadłościan");
        System.out.println("Kula");
        System.out.println("Prostokąt");

        int wybor = input.InputInt();
        switch (wybor){
            case 1:
                System.out.println("Podaj promień");
                double d = input.InputDouble();
                Circle circle = new Circle(d);
                circle.show();
                break;
            case 2:
                System.out.println("Podaj długośc boków kwadratu");
                double f = input.InputDouble();
                Square square = new Square(f);
                square.show();


            default:
                System.out.println("Błąd");
        }
    }
}
