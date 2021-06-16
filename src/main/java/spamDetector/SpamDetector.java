package spamDetector;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class SpamDetector {

    private File spamFile;
    int matchCounter = 0;

    private ArrayList<String> spamWords;

    public SpamDetector(File file, String[] words) {
        spamWords = new ArrayList<>();
        spamWords.addAll(Arrays.asList(words));

        getSpamMatches(file);
    }

    public int getSpamMatches(File file) {
        spamFile = file;
        String currentLine;
        try (BufferedReader br = new BufferedReader(new FileReader(spamFile))) {
            while ((currentLine = br.readLine()) != null) {
                for (String spam : spamWords) {
                    if (currentLine.toLowerCase().contains(spam)) {
                        matchCounter++;
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return matchCounter;
    }

    /*
     * This method classifies spam probability.
     * If it returns -1, spam is unlikely.
     * If it returns 0, the user should be careful.
     * If it returns 1, it is very likely that the message is a spam message.
     */
    public int classifySpam() {
        switch (matchCounter) {
            case 0 -> {
                return -1;
            }
            case 1, 2 -> {
                return 0;
            }
            default -> {
                return 1;
            }
        }
    }

    public boolean isSuspected() {
        return classifySpam() == 0;
    }

    public boolean isSpam() {
        return classifySpam() == 1;
    }
}
