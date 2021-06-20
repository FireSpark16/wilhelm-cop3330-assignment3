/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Xander Wilhelm
 */

package ex42;

import java.util.ArrayList;
import java.util.Map;

public class App {

    public static void main(String[] args) {
        App myApp = new App();
        ReadFile myFileReader = new ReadFile();
        ParseData myDataParser = new ParseData();

        //read in inputs and store each as list
        ArrayList<String> initialInput = new ArrayList<>();
        initialInput = myFileReader.getInput(initialInput);

        //read strings, divide parts, and store in list of maps
        ArrayList<Map<String,String>> data = new ArrayList<>();
        data = myDataParser.removeCommas(initialInput, data);

        //output list of maps
        myApp.output(data);
    }

    private void output(ArrayList<Map<String, String>> data) {
        System.out.println("    Last |    First | Salary");
        System.out.println("----------------------------");
        for(int i = 0; i < data.size(); i++)
        {
            System.out.printf("%8s | %8s | %6s\n", data.get(i).get("First Name"), data.get(i).get("Last Name"), data.get(i).get("Salary"));
        }
    }
}