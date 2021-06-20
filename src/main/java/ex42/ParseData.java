package ex42;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ParseData {
    public ArrayList<Map<String, String>> removeCommas(ArrayList<String> initialInput, ArrayList<Map<String, String>> data) {
        int length = initialInput.size();
        for(int i = 0; i < length; i++)
        {
            //new hashmap and counter
            HashMap<String, String> newMap = new HashMap<>();
            int currentPosition = 0;

            //stores first name - ,
            newMap.put("First Name", waitUntilComma(currentPosition, initialInput, i));
            currentPosition += newMap.get("First Name").length() + 1;

            //stores last name - ,
            newMap.put("Last Name", waitUntilComma(currentPosition, initialInput, i));
            currentPosition += newMap.get("Last Name").length() + 1;

            //stores salary
            newMap.put("Salary", waitUntilComma(currentPosition, initialInput, i));

            //adds data to list of maps
            data.add(newMap);
        }
        //return list of maps
        return data;
    }

    public String waitUntilComma(int currentPosition, ArrayList<String> initialInput, int i) {
        String currentString = "";
        for(int count = currentPosition; ((count < initialInput.get(i).length()) && (initialInput.get(i).charAt(count) != ',')); count++)
        {
            currentString += initialInput.get(i).charAt(count);
        }
        return currentString;
    }
}
