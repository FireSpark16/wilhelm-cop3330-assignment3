package ex43;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.File;

import static org.junit.jupiter.api.Assertions.*;

class MakeFilesTest {
    MakeFiles myFileMaker = new MakeFiles();

    @Test
    @DisplayName("path created correct 'test'")
    void makeStrings1() {

        String siteName = "test";
        String path = myFileMaker.addPrefix(siteName);
        String expected = "./src/main/java/ex43/website/test";
        assertEquals(path,expected);
    }

    @Test
    @DisplayName("path created correct 'hello'")
    void makeStrings2() {

        String siteName = "hello";
        String path = myFileMaker.addPrefix(siteName);
        String expected = "./src/main/java/ex43/website/hello";
        assertEquals(path,expected);
    }

    @Test
    void makeFolder() {
        File expected = new File("./src/main/java/ex43/website/test");
        String path = myFileMaker.addPrefix("test");
        myFileMaker.makeFolder(path);
        assertTrue(expected.exists());
    }

    @Test
    void makePage() {
        File expected = new File("./src/main/java/ex43/website/test/index.html");
        String path = myFileMaker.addPrefix("test/index.html");
        myFileMaker.makeFolder(path);
        assertTrue(expected.exists());
    }

}