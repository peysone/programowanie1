package java_NIO;

import java.io.IOException;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;

public class New_Input_output {
    public static void main(String[] args) throws IOException {


        Path testFilePath = Paths.get("Test");
        System.out.println("Nazwa: " + testFilePath.getFileName());
        System.out.println("URI: " + testFilePath.toUri());
        System.out.println("Absolute: " + testFilePath.toAbsolutePath());
        System.out.println("Normalized: " + testFilePath.normalize());

        //ścieżka jako znormalizowana ścieżka względna
        Path testPathNormalized  = Paths.get(testFilePath.normalize().toString());
        System.out.println("Normalized absolute: " + testPathNormalized.toAbsolutePath());
        System.out.println("Normalized real: " + testFilePath.toRealPath(LinkOption.NOFOLLOW_LINKS));
    }
}