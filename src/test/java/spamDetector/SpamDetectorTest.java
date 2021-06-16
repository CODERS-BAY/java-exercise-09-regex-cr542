package spamDetector;

import org.junit.jupiter.api.Test;

import java.io.File;

import static org.junit.jupiter.api.Assertions.*;

class SpamDetectorTest {
    private File[] spamFiles = new File[] {
            new File("src/main/resources/spams/$1,000.txt"),
            new File("src/main/resources/spams/Britney_and_Friends.txt"),
            new File("src/main/resources/spams/free_shopping.txt"),
            new File("src/main/resources/spams/galaxy_repair.txt")
    };

    private String[] words = new String[] {
            "make money",
            "earn",
            "incredible",
            "nude",
            "naked",
            "hot girl",
            "beautiful",
            "free gift",
            "free shopping",
            "free",
            "earn money",
            "hot",
            "incredible",
            "sexy",
            "sale"
    };


    @Test
    void isSpam() {
        SpamDetector sd0 = new SpamDetector(spamFiles[0], words);
        assertFalse(sd0.isSuspected());
        assertTrue(sd0.isSpam());

        SpamDetector sd1 = new SpamDetector(spamFiles[1], words);
        assertTrue(sd1.isSuspected());
        assertFalse(sd1.isSpam());

        SpamDetector sd2 = new SpamDetector(spamFiles[2], words);
        assertFalse(sd2.isSuspected());
        assertTrue(sd2.isSpam());

        SpamDetector sd3 = new SpamDetector(spamFiles[3], words);
        assertTrue(sd3.isSuspected());
        assertFalse(sd3.isSpam());
    }



}