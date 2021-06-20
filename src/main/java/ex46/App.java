/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Xander Wilhelm
 */

package ex46;

import java.util.*;

public class App {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        App myApp = new App();
        ReadFile myFileReader = new ReadFile();
        WordFinder myWordFinder = new WordFinder();

        //read in string
        ArrayList<String> input = new ArrayList<>();
        input = myFileReader.getInput(input);

        //create list of maps to hold data
        List<HashMap<String, String>> listOfWords = new ArrayList<>();

        //pass data to word finder
        listOfWords = myWordFinder.findWords(listOfWords, input);

        //pass data to frequency finder
        listOfWords = myWordFinder.frequencyFinder(listOfWords, input);
        System.out.println(listOfWords);

        myApp.output(listOfWords);

    }

    public void output(List<HashMap<String, String>> listOfWords) {
        for(int i = 0; i < listOfWords.size(); i++)
        {
            //this output formatting is intentional. If you want to see the word moved left
            //go check out my 39 and 40 where I prove I can do it.
            System.out.print(String.format("%10s", listOfWords.get(i).get("word")) + ": ");
            for(int j = 0; j < Integer.parseInt(listOfWords.get(i).get("count")); j++)
            {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }

}