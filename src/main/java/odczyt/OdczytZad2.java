package odczyt;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

public class OdczytZad2 {
    public static void main(String[] args) throws IOException {
        AtomicInteger licznikLinii = new AtomicInteger(1);
        AtomicInteger licznikSlow = new AtomicInteger(0);

        final Stream<String> lines = Files.lines(Paths.get("tekst.txt"));
        lines.forEach(linia -> {
            int liczbaSlowWLinii = linia.split(" ").length;
            System.out.println("Linia " + licznikLinii.getAndIncrement()
                    + ", liczba słów w linii: " +liczbaSlowWLinii
                    + ", liczba słów narastająco: " + licznikSlow.addAndGet(liczbaSlowWLinii));
        });
    }
}
