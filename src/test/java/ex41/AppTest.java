package ex41;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    @DisplayName("Get Length 7")
    void getLength7() {
        App myApp = new App();
        String[][] people = {
                {"Ling", "Mai"},
                {"Johnson", "Jim"},
                {"Jones", "Aaron"},
                {"Zarnecki", "Sabrina"},
                {"Jones", "Chris"},
                {"Swift", "Geoffrey"},
                {"Xiong", "Fong"}
        };
        int expected = 7;
        int actual = myApp.getLength(people);
        assertEquals(expected,actual);
    }

    @Test
    @DisplayName("Get Length 8")
    void getLength8() {
        App myApp = new App();
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
        int expected = 8;
        int actual = myApp.getLength(people);
        assertEquals(expected,actual);
    }
}