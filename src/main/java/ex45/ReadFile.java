package ex45;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {
    public String getInput(String input) {
        try { //try and input while file is readable
            File myFile = new File("./src/main/java/ex45/exercise45_input.txt");
            Scanner in = new Scanner(myFile);
            while (in.hasNextLine()) { //add lines to input
                input += in.nextLine() + "\n";
            }
            in.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        return input;
    }
}
