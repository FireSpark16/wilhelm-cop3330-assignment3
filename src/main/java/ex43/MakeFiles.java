package ex43;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class MakeFiles {
    public void generateFiles(String siteName, String author, boolean js, boolean css) {
        //create folder
        String path = addPrefix(siteName);
        makeFolder(path);

        //create website
        path = addPrefix((siteName + "/index.html"));
        makePage(path);
        addHead(path,siteName,author);

        //create js folder
        if (js == true)
        {
            path = addPrefix((siteName + "/js/"));
            makeFolder(path);
        }

        //create css folder
        if (css == true)
        {
            path = addPrefix((siteName + "/css/"));
            makeFolder(path);
        }


    }

    public void addHead(String path, String siteName, String author) {
        try {
            FileWriter myWriter = new FileWriter(path);
            myWriter.write("<head>\n");
            myWriter.write("<title>" + siteName + "</title>\n");
            myWriter.write("<meta name=\"author\" content=\"" + author + "\">\n");
            myWriter.write("</head>");
            myWriter.write("<body>\n");
            myWriter.write("<p1>" + siteName + " is a dumb name for a site, " + author + "</p1>\n");
            myWriter.write("</body>\n");
            myWriter.close();
        } catch (IOException e) {
            System.out.println("Error");
            e.printStackTrace();
        }
    }

    public void makePage(String path) {
        try {
            File page = new File(path);
            if (page.createNewFile()) {
                System.out.println("Created: " + path);
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void makeFolder(String path) {
        File folder = new File(path);
        if (folder.mkdir()) {
            System.out.println("Created: " + path);
        } else {
            System.out.println("File already exists.");
        }
    }

    public String addPrefix(String string) {
        return "./src/main/java/ex43/website/" + string;
    }
}
