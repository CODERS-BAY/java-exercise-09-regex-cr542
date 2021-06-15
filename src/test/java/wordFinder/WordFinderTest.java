package wordFinder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WordFinderTest {

    @Test
    public void countWord() {
        WordFinder wf = new WordFinder();

        assertNotEquals(125, wf.countWord());
        assertNotEquals(4, wf.countWord());
        assertEquals(9, wf.countWord());
        assertNotEquals(-1, wf.countWord());
        assertNotEquals(0, wf.countWord());
    }

}