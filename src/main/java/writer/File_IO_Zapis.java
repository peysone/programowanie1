package writer;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.stream.Stream;

public class File_IO_Zapis {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        final Stream<Path> content = Files.list(Paths.get(input));
        content.forEach(path -> {
            System.out.println();
            System.out.println("Ścieżka: " + path.toAbsolutePath());
            try {
                System.out.println("Czas modyfikacji: " + Files.getLastModifiedTime(path));
                if (Files.isDirectory(path)){
                    System.out.println("Jest katalogiem.");
                }else {
                    System.out.println("Jest plikiem.");
                    System.out.println("Rozmiar: " + Files.size(path));
                }
            } catch (IOException e){
                e.printStackTrace();
            }
        });

    }
}
