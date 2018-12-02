package writer;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Wynik_2 {
    public static void main(String[] args) throws IOException {
        try (PrintWriter writer = new PrintWriter(new FileWriter(new File("wynik_2.txt"), true))) {

            System.out.println("Wpisz tekst");

            Scanner scanner = new Scanner(System.in);

            writer.println(scanner.next());


        }
    }
}
