package com.alfabank;
import java.io.FileInputStream;
import java.util.Properties;
import java.io.IOException;

public class FileReader {
    private Properties prop = new Properties();

    public void readFile(String fileName) {

        try (FileInputStream input = new FileInputStream(fileName))
        {
            prop.load(input);
            System.out.println(prop.getProperty("website"));
            System.out.println(prop.getProperty("location"));
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}








