/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Xander Wilhelm
 */

package ex44;

import com.google.gson.Gson;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class App {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        App myApp = new App();
        Gson gson = new Gson();

        //open file and read inputs to string
        String jsonString = myApp.getFile();

        //use gson to read file and send to TheStore class
        TheStore myStore = gson.fromJson(jsonString, TheStore.class);

        //check for items in productSearch
        myApp.productSearch(myStore);
    }

    public void productSearch(TheStore myStore) {
        String input; //input string
        int item = -1; //item location
        while(true)
        {
            input = getInput();
            //check if item was in "database"
            item = getItem(myStore, input, item);

            //if item was found, stop loop and display
            if(item >= 0) {
                displayInventory(myStore.products.get(item));
                break;
            }
            //if not found, loop and try again
            else
                System.out.println("Sorry, that product was not found in our inventory.");
        }
    }

    public int getItem(TheStore myStore, String input, int item) {
        for(int i = 0; i < myStore.products.size(); i++)
        {
            if(input.equals(myStore.products.get(i).get("name")))
            {
                item = i;
            }
        }
        return item;
    }

    public void displayInventory(Map<String, Object> item) {
        System.out.println("Name: " + item.get("name"));
        System.out.println("Price: " + String.format("%.2f",Double.parseDouble(item.get("price").toString())));
        System.out.println("Quantity: " + String.format("%.0f",Double.parseDouble(item.get("quantity").toString())));
    }

    public String getInput() {
        System.out.print("What is the product name? ");
        return in.nextLine();
    }

    public String getFile() {
        String jsonString = "";
        try { //try and input while file is readable
            File myFile = new File("./src/main/java/ex44/exercise44_input.json");
            Scanner in = new Scanner(myFile);
            while (in.hasNextLine()) { //remove commas from strings
                jsonString += in.nextLine();
            }
            in.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        return jsonString;
    }
}