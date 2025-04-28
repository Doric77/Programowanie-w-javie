import java.util.Scanner;

import static jdk.javadoc.internal.doclets.formats.html.markup.HtmlStyle.title;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        UserDAO dao = new UserDAO();

        printBanner("Admin");

    }
    private static void adminMenu(UserDAO dao,Scanner scanner) throws Exception{

    } //koniec adminemu

    //metoda do wyświetlenia glownego baneru
    private  static  void printBanner(String tittle){
        System.out.println("\n" + "*".repeat(40));
        System.out.println(" " +  title);
        System.out.println("\n" + "*".repeat(40));
    }
}