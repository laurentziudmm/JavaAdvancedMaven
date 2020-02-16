package exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class MainChecked {
    public static void main(String[] args) {

        try {
            readFile();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Programul merge mai departe");

    }

    public static void readFile() throws FileNotFoundException {

        FileReader file = new FileReader("C:\\test\\a.txt");


    }
}
