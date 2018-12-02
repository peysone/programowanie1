package zad_dom;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.stream.Stream;

public class Zad5 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Wybierz opcję:");
        System.out.println("[1] - Przejdź do wprowadzenia nazwy katalogu");
        String input = scanner.nextLine();
        System.out.println(" [2] – Zakończ program");
        try {
            if (input.equals("1")) {
                System.out.println("Wprowadź nazwę katalogu");
                String kat = scanner.nextLine();

                final Stream<String> lines = Files.lines(Paths.get(kat));
            } else {
                System.exit(0);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}