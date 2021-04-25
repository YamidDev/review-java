package io;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class InputOutputStreamTest{
    public static void main(String[] args) {
        Path inputPath = Paths.get("C:\\Users\\Yamid\\Desktop\\ejemplo.txt");
        Path outputPath = Paths.get("C:\\Users\\Yamid\\Desktop\\ejemplo2.txt");
        try {
            InputStream input = Files.newInputStream(inputPath, StandardOpenOption.READ);
            Files.newOutputStream(outputPath, StandardOpenOption.CREATE);
            OutputStream output = Files.newOutputStream(outputPath, StandardOpenOption.WRITE);
            int i;
            byte [] data = new byte[1024];
            while ((i = input.read(data)) != -1){
                output.write(data);
            }
            input.close();
            output.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
