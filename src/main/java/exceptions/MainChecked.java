package exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.nio.file.FileAlreadyExistsException;

public class MainChecked {
    public static void main(String[] args) {

        try {
            readFile();
            createFile(".txt");
        } catch (FileNotFoundException e) {
            System.out.println("File not found " + e.getMessage());
        } catch (FileAlreadyExistsException e) {
            //daca vreau sa fac alteceva...alt nume de fisier
            System.out.println("File already exist \n" + e.getMessage());
        } catch (CustomException | InvalidFileExtensionException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("\nFinally block");
        }
        System.out.println("\nProgramul merge mai departe");

//        try {
//            String s = "Ana";
//        } finally {
//            System.out.println("\nTry with error");
//        }

    }

    public static void readFile() throws FileNotFoundException {

//        FileReader file = new FileReader("C:\\test\\a.txt");
        FileReader file2 = new FileReader("/Users/stoicalaurentiu/Programing/Projects/JavaAdvancedMaven/text.txt");
        System.out.println("Successfully read file text.txt");

    }

    public static void createFile (String s) throws FileAlreadyExistsException, CustomException, InvalidFileExtensionException {

        if ( s.equals("sda")) {
            throw new FileAlreadyExistsException("\nFile with name sda already exists");
        }
        if (s.equals("Grupa 9")) {
            throw new CustomException ("\nCannot create file name Grupa 9");
        }
        if (s.contains(".txt")) {
            throw new InvalidFileExtensionException(("\nCannot create file!!"));
        }
    }
}
