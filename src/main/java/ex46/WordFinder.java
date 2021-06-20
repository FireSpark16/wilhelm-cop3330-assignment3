package ex46;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class WordFinder {
    public List<HashMap<String, String>> findWords(List<HashMap<String, String>> listOfWords, ArrayList<String> input) {
        //for each item in input
        for(int i = 0; i < input.size(); i++)
        {
            //assume it's not there...
            boolean isAlreadyThere = false;
            //for each item within list
            for(int j = 0; j < listOfWords.size(); j++)
            {
                //check if input is already present in list
                if(input.get(i).equals(listOfWords.get(j).get("word")))
                {
                    //...if so, set to true
                    isAlreadyThere = true;
                }
            }
            //if it wasn't in list
            if(!isAlreadyThere || i == 0)
            {
                //add it to the list
                HashMap<String, String> newMap = new HashMap<>();
                newMap.put("word", input.get(i));
                listOfWords.add(newMap);
            }
        }
        //return list
        return listOfWords;
    }

    public List<HashMap<String, String>> frequencyFinder(List<HashMap<String, String>> listOfWords, ArrayList<String> input) {
        //don't edit list size while reading
        int listCount = listOfWords.size();
        //for each item in the list
        for(int i = 0; i < listCount; i++)
        {
            int count = 0;
            for(int j = 0; j < input.size(); j++) {
                //compare it to each item in the input
                if (listOfWords.get(i).get("word").equals(input.get(j))) {
                    count++;
                }
            }
            //and add the count to the list
            listOfWords.get(i).put("count", String.valueOf(count));
        }
        return listOfWords;
    }
}
