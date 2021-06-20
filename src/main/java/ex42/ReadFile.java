package ex42;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ReadFile {
    public ArrayList<String> getInput(ArrayList<String> initialInput) {
        try { //try and input while file is readable
            File myFile = new File("./src/main/java/ex42/exercise42_input.txt");
            Scanner in = new Scanner(myFile);
            while (in.hasNextLine()) { //remove commas from strings
                initialInput.add(in.nextLine());
            }
            in.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        return initialInput;
    }
}
