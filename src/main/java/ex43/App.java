/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Xander Wilhelm
 */

package ex43;

import java.util.*;

public class App {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        App myApp = new App();
        MakeFiles myFileMaker = new MakeFiles();

        //get inputs
        String siteName = myApp.getInput("Site name: ");
        String author = myApp.getInput("Author: ");
        boolean js = myApp.getInputTF("Do you want a folder for JavaScript? ");
        boolean css = myApp.getInputTF("Do you want a folder for CSS? ");

        //send inputs to generation class
        myFileMaker.generateFiles(siteName,author,js,css);
    }

    public boolean getInputTF(String s) {
        System.out.print(s);
        while(true)
        {
            String result = in.nextLine();
            if(result.equals("y") || result.equals("Y"))
                return true;
            else if(result.equals("n") || result.equals("N"))
                return false;
            else
                System.out.println("Please enter 'y' or 'n'.");
        }
    }

    public String getInput(String s) {
        System.out.print(s);
        return in.nextLine();
    }

}