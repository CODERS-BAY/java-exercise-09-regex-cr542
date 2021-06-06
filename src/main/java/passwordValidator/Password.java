package passwordValidator;

import java.io.*;
import java.util.ArrayList;

public class Password {
    private static final int MIN_SIZE = 10;
    private String characters;

    /*
     * Password blacklist could also be a static variable. In this case, each Password Object
     * has its blacklist to work with (generated from file).
     * The blacklist is loaded by the constructor whenever a Password Object is created.
     */
    private ArrayList<String> blacklist = new ArrayList<>();

    private static File blacklistFile = new File("src/main/resources/dict/passwords.txt");

    /*
     * Definition of a secure password:
     * - Minimum length of 10 chars
     * - Must contain at least two number values and one special character (@ % & ...)
     * - Must not be in the given passwords list
     */

    /*
     * To Do:
     * - Import pw list and check if a generated password is allowed due to this list
     * - Check if the password string contains at least two number values and one special char
     * -
     */

    public Password(String input) {
        this.characters = input;
        this.initializeBlacklist();
    }

    public boolean hasRequiredLength() {
        return characters.length() >= MIN_SIZE;
    }

    public boolean isOnBlacklist() {
        for (String pw : blacklist) {
            if (this.characters.equalsIgnoreCase(pw)) {
                return true;
            }
        }
        return false;
    }

    public boolean matchesRequiredPattern() {
        String pattern = "[\w]";
        /*
         * 2 x number / 1 x specialChar
         */
        return getCharacters().matches(pattern);
    }

    public boolean meetsValidationRules() {
        return hasRequiredLength() && !isOnBlacklist() && matchesRequiredPattern();
    }

    public String getCharacters() {
        return characters;
    }

    public String toString() {
        return characters;
    }

    /*
     * *****************
     * PRIVATE METHODS *
     * *****************
     */

    private void initializeBlacklist() {
        try (BufferedReader br = new BufferedReader(new FileReader(blacklistFile))) {
            String line = "";
            while ((line = br.readLine()) != null) {
                blacklist.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void searchBlacklist(String key) {
        for (String search : blacklist) {
            if (search.equalsIgnoreCase(key)) {
                System.out.println("[*] Found match: Key [ " + key + " ] matches blacklist entry: { " + search + " }");
            }
        }
    }

}
