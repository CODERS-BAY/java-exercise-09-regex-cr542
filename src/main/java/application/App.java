package application;

import wordFinder.WordFinder;

public class App {

    public static void main(String[] args) {
        WordFinder wf = new WordFinder();
        System.out.println(wf.countWord());
    }

}
