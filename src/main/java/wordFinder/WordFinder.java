package wordFinder;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class WordFinder {

    private static File wordFile = new File("src/main/resources/search/find_java.txt");

    public int countWord() {
        int counter = 0;
//        String searchPattern = "(?i)(\\bJava\\b)+?";
        try (BufferedReader br = new BufferedReader(new FileReader(wordFile))) {
            String line = "";
            while ((line = br.readLine()) != null) {
                if(line.toLowerCase().contains("java")) {
                    counter++;
                }
            }
        } catch (
                IOException e) {
            e.printStackTrace();
        }
        return counter;
    }

}
