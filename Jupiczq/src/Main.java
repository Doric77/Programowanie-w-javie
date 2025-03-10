import Class.Person;
import FiguryGeometryczne.Calculator;

public class Main {
    public static void  main(String[] args) {
    Person person = new Person("Star","Butterfly",15, "1349254","Wydział nauk magicznych");
    person.View();
        System.out.println(person.toString());
    System.out.println(person.PersonData());


    String name ="Ala ma kota";
            boolean result = name instanceof String;
        System.out.println("zmienna name jest instancją klasy string ? " + result);
        boolean result1 = person instanceof  Person;
        System.out.println("Obiekt person jest klasy Person ? " + result);

        Calculator calculator = new Calculator();
        calculator.RunTask();



    }
}
