/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Xander Wilhelm
 */

package ex41;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class App {

    public static void main(String[] args) {
        App myApp = new App();
        ReadFile myFileReader = new ReadFile();
        Sorter mySorter = new Sorter();

        //read in inputs and store to 2D array
        String[][] people = new String[7][2];
        people = myFileReader.getPeople(people);

        //get input size
        int length = myApp.getLength(people);

        //sort the 2D array
        people = mySorter.sort(people, length);

        //output the 2D array
        myApp.output(people, length);
    }

    public void output(String[][] people, int length) {
        //creates a new file
        try {
            File newFile = new File("./src/main/java/ex41/exercise41_output.txt");
            newFile.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

        //writes the names to the file
        try {
            FileWriter myWriter = new FileWriter("./src/main/java/ex41/exercise41_output.txt");
            myWriter.write("Total of " + length + " names\n");
            myWriter.write("-----------------\n");
            for (int i = 0; i < length; i++) {
                myWriter.write(people[i][0]);
                myWriter.write(", " + people[i][1] + "\n");
            }
            myWriter.close();
        } catch (IOException e) {
            System.out.println("Error");
            e.printStackTrace();
        }

    }

    public int getLength(String[][] people) {
        return people.length;
    }
}
