package passwordValidator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PasswordTest {

    Password password = new Password("aajerjd");

    @Test
    void hasRequiredLength() {
        Password password1 = new Password("asdjgerjrer");
        Password password2 = new Password("ergteeteterer");
        Password password3 = new Password("wetrgrrzrztr");
        Password password4 = new Password("aajerjdaawerer");
        assertTrue(password1.hasRequiredLength());
        assertTrue(password2.hasRequiredLength());
        assertTrue(password3.hasRequiredLength());
        assertTrue(password4.hasRequiredLength());
    }


    @Test
    void isOnBlacklist() {
        Password password1 = new Password("hallo");
        Password password2 = new Password("Dormicum-32");
        Password password3 = new Password("123456");

        assertTrue(password1.isOnBlacklist());
        assertFalse(password2.isOnBlacklist());
        assertTrue(password3.isOnBlacklist());
    }

    @Test
    void matchesRequiredPattern() {
        Password password1 = new Password("hallo");
        Password password2 = new Password("Dormicum-32");
        Password password3 = new Password("123456");
        Password pw4 = new Password("Roman");
        Password pw5 = new Password("Roman235");
        Password pw6 = new Password("Roman+Huber12");

        assertFalse(password1.meetsValidationRules());
        assertTrue(password2.meetsValidationRules());
        assertFalse(password3.meetsValidationRules());

        assertFalse(pw4.meetsValidationRules());
        assertFalse(pw5.meetsValidationRules());
        assertTrue(pw6.meetsValidationRules());
    }

    @Test
    void meetsValidationRules() {
        Password password1 = new Password("hallo");
        Password password2 = new Password("Dormicum-32");
        Password password3 = new Password("123456");
        Password pw4 = new Password("Roman-23");
        Password pw5 = new Password("Roman235");
        Password pw6 = new Password("Roman+Huber12");

        assertFalse(password1.meetsValidationRules());
        assertTrue(password2.meetsValidationRules());
        assertFalse(password3.meetsValidationRules());

        assertFalse(pw4.meetsValidationRules());
        assertFalse(pw5.meetsValidationRules());
        assertTrue(pw6.meetsValidationRules());
    }
}