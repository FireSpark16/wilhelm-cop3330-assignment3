package ex44;

import com.google.gson.Gson;
import jdk.jfr.Name;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.extension.RegisterExtension;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    @DisplayName("Find item Thing")
    void findItem1() {
        App myApp = new App();
        Gson gson = new Gson();
        String jsonString = myApp.getFile();
        TheStore myStore = gson.fromJson(jsonString, TheStore.class);
        String input = "Thing";
        int item = -1;
        int retVal = myApp.getItem(myStore, input, item);
        int expected = 1;
        assertEquals(retVal,expected);
    }

    @Test
    @DisplayName("Find item Widget")
    void findItem2() {
        App myApp = new App();
        Gson gson = new Gson();
        String jsonString = myApp.getFile();
        TheStore myStore = gson.fromJson(jsonString, TheStore.class);
        String input = "Widget";
        int item = -1;
        int retVal = myApp.getItem(myStore, input, item);
        int expected = 0;
        assertEquals(retVal,expected);
    }

    @Test
    @DisplayName("Find item Doodad")
    void findItem3() {
        App myApp = new App();
        Gson gson = new Gson();
        String jsonString = myApp.getFile();
        TheStore myStore = gson.fromJson(jsonString, TheStore.class);
        String input = "Doodad";
        int item = -1;
        int retVal = myApp.getItem(myStore, input, item);
        int expected = 2;
        assertEquals(retVal,expected);
    }

    @Test
    @DisplayName("Find item doodad")
    void findItem4() {
        App myApp = new App();
        Gson gson = new Gson();
        String jsonString = myApp.getFile();
        TheStore myStore = gson.fromJson(jsonString, TheStore.class);
        String input = "doodad";
        int item = -1;
        int retVal = myApp.getItem(myStore, input, item);
        int expected = -1;
        assertEquals(retVal,expected);
    }

    @Test
    @DisplayName("Find item ''")
    void findItem5() {
        App myApp = new App();
        Gson gson = new Gson();
        String jsonString = myApp.getFile();
        TheStore myStore = gson.fromJson(jsonString, TheStore.class);
        String input = "";
        int item = -1;
        int retVal = myApp.getItem(myStore, input, item);
        int expected = -1;
        assertEquals(retVal,expected);
    }
}