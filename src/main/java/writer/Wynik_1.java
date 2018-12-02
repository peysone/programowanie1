package writer;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Wynik_1 {
    public static void main(String[] args)throws IOException {
        try (PrintWriter writer = new PrintWriter(new FileWriter(new File("wynik_1.txt"), true))) {


            writer.println("Hello World!");
            writer.println("Jakiś tekst");
            writer.println("Kolejny tekst");
        }
    }
}
