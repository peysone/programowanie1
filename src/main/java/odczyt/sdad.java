package odczyt;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class sdad {
    public static void main(String[] args) throws IOException {
        try (PrintWriter writer = new PrintWriter(new FileWriter(new File("produkty.txt"), true))) {


            writer.println("O;Banan;1;20\n" +
                    "O;Jabłko;2;30\n" +
                    "W;Cebula;1;50\n" +
                    "O;Arbuz;10;5\n" +
                    "W;Kalafior;5;10\n" +
                    "O;Granat;12;3\n");
        }
    }
}
