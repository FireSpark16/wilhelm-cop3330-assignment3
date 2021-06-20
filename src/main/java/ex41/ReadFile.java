package ex41;

import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files

public class ReadFile {

    public String[][] getPeople(String[][] people)
    {
        try { //try and input while file is readable
            File myFile = new File("./src/main/java/ex41/exercise41_input.txt");
            Scanner in = new Scanner(myFile);
            int i = 0;
            while (in.hasNextLine()) { //remove commas from strings
                String data = in.next();
                data = data.substring(0,data.length() - 1);
                people[i][0] = data;
                data = in.next();
                people[i][1] = data;
                i++;
            }
            in.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        return people;
    }
}
