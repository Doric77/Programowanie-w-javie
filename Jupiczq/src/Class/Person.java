package Class;

public class Person {

    public String fristName;
    public String lastName;
    int age;
    String nrAlbumu, kierunek;
final int wiek = 15;
Adres adres;

    public int getWiek() {
        return wiek;
    }
    public final void WypiszWiek(){
        System.out.println("Metoda final,wiek"+getWiek());
    }

    public String getFristName() {
        return fristName;
    }

    public void setFristName(String fristName) {
        this.fristName = fristName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getNrAlbumu() {
        return nrAlbumu;
    }

    public void setNrAlbumu(String nrAlbumu) {
        this.nrAlbumu = nrAlbumu;
    }

    public String getKierunek() {
        return kierunek;
    }

    public void setKierunek(String kierunek) {
        this.kierunek = kierunek;
    }

    public void View() {
        System.out.println("Imię:"+fristName+"Nazwisko");
    }
    public String PersonData(){
        return "witaj: "+fristName + " "+ lastName +",twój wiek: " + age;

    }

    public Person(String fristName , String lastName, int age, String nrAlbumu, String kierunek) {
        this.fristName = fristName;
        this.lastName = lastName;
        this.age = age;
        this.nrAlbumu = nrAlbumu;
        this.kierunek = kierunek;
    }

    @Override
    public String toString() {
        return "Person{" +
                "fristName='" + fristName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", nrAlbumu='" + nrAlbumu + '\'' +
                ", kierunek='" + kierunek + '\'' +
                '}';
    }
}
