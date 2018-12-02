package writer;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;


public class Wynik_3 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Wpisz nazwe pliku");
        String nazwa = scanner.next();
        System.out.println("Czy plik ma być wyczyszczony?(true or false)");
        Boolean czyszczenie = scanner.nextBoolean();
        String tekst = scanner.nextLine();
        try (PrintWriter writer = new PrintWriter
                (new FileWriter(
                        new File(nazwa), czyszczenie))) {

            do {

                System.out.println("Wpisz tekst");
                nazwa = scanner.nextLine();

                if (!tekst.equalsIgnoreCase("koniec")) {
                    writer.println(tekst);
                    writer.flush();
                }


            } while (!tekst.equalsIgnoreCase("koniec"));
        }
    }
}