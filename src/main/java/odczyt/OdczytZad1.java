package odczyt;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class OdczytZad1 {
    public static void main(String[] args) throws IOException {
        final Stream<String> lines = Files.lines(Paths.get("Wynik_1.txt"));
        lines.forEach(linia -> {
            System.out.println();
            System.out.println(linia.toLowerCase());
            System.out.println(linia.toUpperCase());
            System.out.println(linia.replace("e", "X"));
        });
    }
}
