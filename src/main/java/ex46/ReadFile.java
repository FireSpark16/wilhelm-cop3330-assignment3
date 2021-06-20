package ex46;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ReadFile {
    public ArrayList<String> getInput(ArrayList<String> input) {
        try { //try and input while file is readable
            File myFile = new File("./src/main/java/ex46/exercise46_input.txt");
            Scanner in = new Scanner(myFile);
            while (in.hasNext()) { //add lines to input
                input.add(in.next());
            }
            in.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        return input;
    }
}
