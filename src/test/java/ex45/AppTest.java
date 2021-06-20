package ex45;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.File;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    App myApp = new App();

    @Test
    void createOutputFile() {
        File expected = new File("./src/main/java/ex45/test.txt");
        myApp.createOutputFile("test", "hello, this is my test");
        assertTrue(expected.exists());
    }

    @Test
    @DisplayName("replace original")
    void replaceInput1() {
        String original = "One should never utilize the word \"utilize\" in writing. Use \"use\" instead.\n" +
                "For example, \"She uses an IDE to write her Java programs\" instead of \"She\n" +
                "utilizes an IDE to write her Java programs\".";
        String replacedString = myApp.replaceInput(original);
        String expected = "One should never use the word \"use\" in writing. Use \"use\" instead.\n" +
                "For example, \"She uses an IDE to write her Java programs\" instead of \"She\n" +
                "uses an IDE to write her Java programs\".";
        assertEquals(replacedString,expected);
    }

    @Test
    @DisplayName("replace new")
    void replaceInput2() {
        String original = "utilize utilize. utilizeutilizeutilize. \"utilize\".";
        String replacedString = myApp.replaceInput(original);
        String expected = "use use. useuseuse. \"use\".";
        assertEquals(replacedString,expected);
    }
}