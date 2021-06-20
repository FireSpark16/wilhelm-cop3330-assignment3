package ex46;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    ex46.App myApp = new ex46.App();
    ReadFile myFileReader = new ReadFile();
    WordFinder myWordFinder = new WordFinder();

    @Test
    @DisplayName("Test if list gets right data")
    void correctItems() {
        ArrayList<String> input = new ArrayList<>();
        input = myFileReader.getInput(input);

        List<HashMap<String, String>> listOfWords = new ArrayList<>();

        listOfWords = myWordFinder.findWords(listOfWords, input);
        List<HashMap<String, String>> expected = new ArrayList<>();

        HashMap<String, String> newMap1 = new HashMap<>();
        newMap1.put("word", "badger");
        expected.add(newMap1);

        HashMap<String, String> newMap2 = new HashMap<>();
        newMap2.put("word", "mushroom");
        expected.add(newMap2);

        HashMap<String, String> newMap3 = new HashMap<>();
        newMap3.put("word", "snake");
        expected.add(newMap3);

        assertEquals(expected,listOfWords);
    }

    @Test
    @DisplayName("Test if list gets right data")
    void correctCounts() {
        ArrayList<String> input = new ArrayList<>();
        input = myFileReader.getInput(input);

        List<HashMap<String, String>> listOfWords = new ArrayList<>();

        listOfWords = myWordFinder.findWords(listOfWords, input);

        listOfWords = myWordFinder.frequencyFinder(listOfWords, input);

        assertEquals(7,Integer.parseInt(listOfWords.get(0).get("count")));
        assertEquals(2,Integer.parseInt(listOfWords.get(1).get("count")));
        assertEquals(1,Integer.parseInt(listOfWords.get(2).get("count")));
    }
}