package mailValidator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MailValidatorTest {

    @Test
    public void isValid() {
        MailValidator mv = new MailValidator();

        mv.setMailAddress("emag.ee@gmx"); // Regex returns this True but is not allowed?
        assertFalse(mv.isValid());

        mv.setMailAddress("chris@gmail.com");
        assertTrue(mv.isValid());

        mv.setMailAddress("112354@gmx.com");
        assertTrue(mv.isValid());

        mv.setMailAddress("123gerold@gmx.at");
        assertTrue(mv.isValid());

        mv.setMailAddress("kurt.maier@edumail.com");
        assertTrue(mv.isValid());

        mv.setMailAddress("jakobhuber.mail.gmail.com");
        assertFalse(mv.isValid());

    }

}