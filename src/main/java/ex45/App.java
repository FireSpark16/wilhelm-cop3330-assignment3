/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Xander Wilhelm
 */

package ex45;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class App {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        App myApp = new App();
        ReadFile myFileReader = new ReadFile();

        //read in string
        String input = "";
        input = myFileReader.getInput(input);
        System.out.println(input);

        //replace occurrences from string
        String replacedString = myApp.replaceInput(input);
        System.out.println(replacedString);

        //write new string to new file
        String newFileName = myApp.getInput();
        myApp.createOutputFile(newFileName, replacedString);
    }

    public void createOutputFile(String newFileName, String replacedString) {
        //create new file
        try {
            String path = "./src/main/java/ex45/" + newFileName + ".txt";
            File page = new File(path);
            if (page.createNewFile()) {
                //if file was successfully made
                try {
                    //write to the file
                    FileWriter myWriter = new FileWriter(path);
                    myWriter.write(replacedString);
                    myWriter.close();
                } catch (IOException e) {
                    System.out.println("Error");
                    e.printStackTrace();
                }
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String getInput() {
        System.out.print("What would you like the output file to be called? ");
        return in.nextLine();
    }

    public String replaceInput(String input) {
        return input.replaceAll("utilize", "use");
    }

}