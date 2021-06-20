package ex42;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

/*
Note: My other classes either read input, only assign simple values, or display output.
The only function that needs to be tested in this case is the one which handles all
the non-input and non-output work, which is ParseData.
 */

class ParseDataTest {

    @Test
    @DisplayName("Ling")
    void waitUntilComma1() {
        App myApp = new App();
        ReadFile myFileReader = new ReadFile();
        ParseData myDataParser = new ParseData();

        ArrayList<String> initialInput = new ArrayList<>();
        initialInput = myFileReader.getInput(initialInput);

        String actual = myDataParser.waitUntilComma(0, initialInput, 0);
        String expected = "Ling";

        assertEquals(actual,expected);
    }

    @Test
    @DisplayName("Mai")
    void waitUntilComma2() {
        App myApp = new App();
        ReadFile myFileReader = new ReadFile();
        ParseData myDataParser = new ParseData();

        ArrayList<String> initialInput = new ArrayList<>();
        initialInput = myFileReader.getInput(initialInput);

        String actual = myDataParser.waitUntilComma(5, initialInput, 0);
        String expected = "Mai";

        assertEquals(actual,expected);
    }

    @Test
    @DisplayName("55900")
    void waitUntilComma3() {
        App myApp = new App();
        ReadFile myFileReader = new ReadFile();
        ParseData myDataParser = new ParseData();

        ArrayList<String> initialInput = new ArrayList<>();
        initialInput = myFileReader.getInput(initialInput);

        String actual = myDataParser.waitUntilComma(9, initialInput, 0);
        String expected = "55900";

        assertEquals(actual,expected);
    }
}