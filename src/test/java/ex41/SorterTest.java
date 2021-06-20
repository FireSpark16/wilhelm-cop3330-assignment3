package ex41;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SorterTest {

    @Test
    @DisplayName("Sort 7")
    void sort7() {
        Sorter mySorter = new Sorter();
        String[][] people = {
                {"Ling", "Mai"},
                {"Johnson", "Jim"},
                {"Zarnecki", "Sabrina"},
                {"Jones", "Chris"},
                {"Jones", "Aaron"},
                {"Swift", "Geoffrey"},
                {"Xiong", "Fong"}
        };
        String[][] expected = {
                {"Johnson", "Jim"},
                {"Jones", "Aaron"},
                {"Jones", "Chris"},
                {"Ling", "Mai"},
                {"Swift", "Geoffrey"},
                {"Xiong", "Fong"},
                {"Zarnecki", "Sabrina"}
        };
        String[][] actual = mySorter.sort(people, 7);
        assertArrayEquals(expected,actual);
    }

    @Test
    @DisplayName("Sort 8")
    void sort8() {
        Sorter mySorter = new Sorter();
        String[][] people = {
                {"Ling", "Mai"},
                {"Johnson", "Jim"},
                {"Zarnecki", "Sabrina"},
                {"Jones", "Chris"},
                {"Jones", "Aaron"},
                {"Swift", "Geoffrey"},
                {"Xiong", "Fong"},
                {"Amy", "Butler"}
        };
        String[][] expected = {
                {"Amy", "Butler"},
                {"Johnson", "Jim"},
                {"Jones", "Aaron"},
                {"Jones", "Chris"},
                {"Ling", "Mai"},
                {"Swift", "Geoffrey"},
                {"Xiong", "Fong"},
                {"Zarnecki", "Sabrina"}
        };
        String[][] actual = mySorter.sort(people, 8);
        assertArrayEquals(expected,actual);
    }
}